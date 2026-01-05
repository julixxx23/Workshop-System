package repairShop.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repairShop.dto.pago.PagoCreateDTO;
import repairShop.dto.pago.PagoResponseDTO;
import repairShop.dto.pago.PagoSimpleDTO;

public interface PagoService {
    PagoResponseDTO crear(PagoCreateDTO dto);
    void eliminar(Long id);
    PagoResponseDTO buscarPorId(Long id);
    Page<PagoSimpleDTO> buscarTodos(Pageable pageable);
}
