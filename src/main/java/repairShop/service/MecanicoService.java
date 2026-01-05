package repairShop.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repairShop.dto.mecanico.MecanicoCreateDTO;
import repairShop.dto.mecanico.MecanicoResponseDTO;
import repairShop.dto.mecanico.MecanicoSimpleDTO;
import repairShop.dto.mecanico.MecanicoUpdateDTO;

public interface MecanicoService {
    MecanicoResponseDTO crear(MecanicoCreateDTO dto);
    MecanicoResponseDTO actualizar(MecanicoUpdateDTO dto);
    void eliminar(Long id);
    MecanicoResponseDTO buscarPorId(Long id);
    Page<MecanicoSimpleDTO> buscarTodos(Pageable pageable);
}
