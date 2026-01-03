package repairShop.dto.ordendetalle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.models.OrdenDetalle;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdenDetalleSimpleDTO {
    private Long id;
    private String tipoServicio;
    private BigDecimal subTotal;

    public static OrdenDetalleSimpleDTO fromEntity(OrdenDetalle ordenDetalle) {
        return OrdenDetalleSimpleDTO.builder()
                .id(ordenDetalle.getId())
                .tipoServicio(ordenDetalle.getServicio().getTipoServicio().name())
                .subTotal(ordenDetalle.getSubTotal())
                .build();
    }
}