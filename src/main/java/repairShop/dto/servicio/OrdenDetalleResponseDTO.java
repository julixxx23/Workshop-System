package repairShop.dto.servicio;

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
public class OrdenDetalleResponseDTO {
    private Long id;
    private BigDecimal precioUnitario;
    private BigDecimal subTotal;
    private Long idOrden;
    private Long idServicio;
    private String tipoServicio;
    private Long idMecanico;

    public static OrdenDetalleResponseDTO fromEntity(OrdenDetalle ordenDetalle) {
        return OrdenDetalleResponseDTO.builder()
                .id(ordenDetalle.getId())
                .precioUnitario(ordenDetalle.getPrecioUnitario())
                .subTotal(ordenDetalle.getSubTotal())
                .idOrden(ordenDetalle.getOrden().getId())
                .idServicio(ordenDetalle.getServicio().getId())
                .tipoServicio(ordenDetalle.getServicio().getTipoServicio().name())
                .idMecanico(ordenDetalle.getMecanico().getId())
                .build();
    }
}