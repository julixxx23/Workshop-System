package repairShop.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repairShop.dto.servicio.ServicioCreateDTO;
import repairShop.dto.servicio.ServicioResponseDTO;
import repairShop.dto.servicio.ServicioSimpleDTO;
import repairShop.dto.servicio.ServicioUpdateDTO;

public interface ServicioService {
    ServicioResponseDTO crear(ServicioCreateDTO dto);
    ServicioResponseDTO actualizar(ServicioUpdateDTO dto);
    void eliminar(Long id);
    ServicioResponseDTO buscarPorId(Long id);
    Page<ServicioSimpleDTO> buscarTodos(Pageable pageable);
}
