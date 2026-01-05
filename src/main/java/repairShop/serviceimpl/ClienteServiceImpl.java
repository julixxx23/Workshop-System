package repairShop.serviceimpl;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repairShop.dto.cliente.ClienteCreateDTO;
import repairShop.dto.cliente.ClienteResponseDTO;
import repairShop.dto.cliente.ClienteSimpleDTO;
import repairShop.dto.cliente.ClienteUpdateDTO;
import repairShop.models.Cliente;
import repairShop.repository.ClienteRepository;
import repairShop.service.ClienteService;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteResponseDTO crear(ClienteCreateDTO dto) {
        Long nitLong = null;
        if (dto.getNit() != null && !dto.getNit().isEmpty()) {
            nitLong = Long.valueOf(dto.getNit());
            if (clienteRepository.existsByNit(nitLong)) {
                throw new RuntimeException("Ya existe un cliente con ese NIT");
            }
        }
        if (clienteRepository.existsByCorreoElectronico(dto.getCorreoElectronico())) {
            throw new RuntimeException("Ya existe un cliente con ese correo");
        }

        Cliente cliente = Cliente.builder()
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .direccion(dto.getDireccion())
                .correoElectronico(dto.getCorreoElectronico())
                .nit(nitLong)
                .build();

        return ClienteResponseDTO.fromEntity(clienteRepository.save(cliente));
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public ClienteResponseDTO buscarPorId(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con ID: " + id));
        return ClienteResponseDTO.fromEntity(cliente);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public Page<ClienteSimpleDTO> buscarTodos(Pageable pageable) {
        return clienteRepository.findAll(pageable)
                .map(ClienteSimpleDTO::fromEntity);
    }

    @Override
    public ClienteResponseDTO actualizar(ClienteUpdateDTO dto) {
        Cliente cliente = clienteRepository.findById(dto.getId())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado por Id: " + dto.getId()));

        cliente.setNombre(dto.getNombre());
        cliente.setApellido(dto.getApellido());
        cliente.setDireccion(dto.getDireccion());
        cliente.setCorreoElectronico(dto.getCorreoElectronico());
        cliente.setTelefono(dto.getTelefono());
        cliente.setNit(dto.getNit());

        return ClienteResponseDTO.fromEntity(clienteRepository.save(cliente));
    }

    @Override
    public void eliminar(Long id) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("No se puede eliminar: Cliente no encontrado con ID: " + id);
        }
        clienteRepository.deleteById(id);
    }
}