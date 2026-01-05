package repairShop.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repairShop.dto.orden.OrdenCreateDTO;
import repairShop.dto.orden.OrdenResponseDTO;
import repairShop.dto.orden.OrdenSimpleDTO;
import repairShop.dto.orden.OrdenUpdateDTO;

public interface OrdenService {
    OrdenResponseDTO crear(OrdenCreateDTO dto);
    OrdenResponseDTO actualizar(OrdenUpdateDTO dto);
    void eliminar(Long id);
    OrdenResponseDTO buscarPorId(Long id);
    Page<OrdenSimpleDTO> buscarTodos(Pageable pageable);
}
