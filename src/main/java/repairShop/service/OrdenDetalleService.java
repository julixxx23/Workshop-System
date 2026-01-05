package repairShop.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repairShop.dto.ordendetalle.OrdenDetalleCreateDTO;
import repairShop.dto.ordendetalle.OrdenDetalleResponseDTO;
import repairShop.dto.ordendetalle.OrdenDetalleSimpleDTO;
import repairShop.dto.ordendetalle.OrdenDetalleUpdateDTO;

public interface OrdenDetalleService {
    OrdenDetalleResponseDTO crear(OrdenDetalleCreateDTO dto);
    OrdenDetalleResponseDTO actualizar(OrdenDetalleUpdateDTO dto);
    void eliminar(Long id);
    OrdenDetalleResponseDTO buscarPorId(Long id);
    Page<OrdenDetalleSimpleDTO> buscarTodos(Pageable pageable);
}
