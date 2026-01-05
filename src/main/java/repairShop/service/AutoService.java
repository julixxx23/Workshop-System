package repairShop.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repairShop.dto.auto.AutoCreateDTO;
import repairShop.dto.auto.AutoResponseDTO;
import repairShop.dto.auto.AutoSimpleDTO;
import repairShop.dto.auto.AutoUpdateDTO;

public interface AutoService {
    AutoResponseDTO crear(AutoCreateDTO dto);
    AutoResponseDTO actualizar(AutoUpdateDTO dto);
    void eliminar(Long id);
    AutoResponseDTO buscarPorId(Long id);
    Page<AutoSimpleDTO> buscarTodos(Pageable pageable);
}
