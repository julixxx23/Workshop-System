package repairShop.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repairShop.dto.cliente.ClienteCreateDTO;
import repairShop.dto.cliente.ClienteResponseDTO;
import repairShop.dto.cliente.ClienteSimpleDTO;
import repairShop.dto.cliente.ClienteUpdateDTO;
import repairShop.models.Cliente;

import java.util.List;

public interface ClienteService {
    ClienteResponseDTO crear(ClienteCreateDTO dto);
    ClienteResponseDTO actualizar(ClienteUpdateDTO dto);
    void eliminar(Long id);
    ClienteResponseDTO buscarPorId(Long id);
    Page<ClienteSimpleDTO> buscarTodos(Pageable pageable);
}
