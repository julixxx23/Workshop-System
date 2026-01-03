package repairShop.dto.pago;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.models.Pago;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagoSimpleDTO {
    private Long id;
    private LocalDateTime fechaPago;
    private BigDecimal montoPagado;

    public static PagoSimpleDTO fromEntity(Pago pago){
        return PagoSimpleDTO.builder()
                .id(pago.getId())
                .fechaPago(pago.getFechaPago())
                .montoPagado(pago.getMontoPagado())
                .build();
    }
}
