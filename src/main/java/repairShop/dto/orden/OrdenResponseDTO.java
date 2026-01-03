package repairShop.dto.orden;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.dto.auto.AutoSimpleDTO;
import repairShop.models.Orden;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdenResponseDTO {
    private Long id;
    private AutoSimpleDTO auto;
    private LocalDateTime fechaIngreso;
    private String observaciones;
    private BigDecimal montoTotal;

    public static OrdenResponseDTO fromEntity(Orden orden){
        return OrdenResponseDTO.builder()
                .id(orden.getId())
                .auto(orden.getAuto() != null?
                        AutoSimpleDTO.fromEntity(orden.getAuto()) : null)
                .fechaIngreso(orden.getFechaIngreso())
                .observaciones(orden.getObservaciones())
                .montoTotal(orden.getMontoTotal())
                .build();
    }
}
