package repairShop.dto.pago;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.dto.orden.OrdenSimpleDTO;
import repairShop.models.Pago;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagoResponseDTO {
    private Long id;
    private OrdenSimpleDTO orden;
    private LocalDateTime fechaPago;
    private BigDecimal montoPagado;
    private String pagoEstado;

    public static PagoResponseDTO fromEntity(Pago pago){
        return PagoResponseDTO.builder()
                .id(pago.getId())
                .orden(pago.getOrden() != null ?
                        OrdenSimpleDTO.fromEntity(pago.getOrden()) : null)
                .fechaPago(pago.getFechaPago())
                .montoPagado(pago.getMontoPagado())
                .pagoEstado(pago.getPagoEstado().name())
                .build();
    }
}
