package repairShop.dto.orden;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.models.Orden;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdenSimpleDTO {
    private Long id;
    private LocalDateTime fechaIngreso;
    private String observaciones;
    private BigDecimal montoTotal;

    public static OrdenSimpleDTO fromEntity(Orden orden){
        return OrdenSimpleDTO.builder()
                .id(orden.getId())
                .fechaIngreso(orden.getFechaIngreso())
                .observaciones(orden.getObservaciones())
                .montoTotal(orden.getMontoTotal())
                .build();
    }
}
