package repairShop.dtos.ordenDetalle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenDetalleResponseDTO {
    private Long id;
    private BigDecimal precioUnitario;
    private BigDecimal subTotal;

    // Información "aplanada" para que el Frontend no tenga que hacer más peticiones
    private Long idOrden;

    private Long idServicio;
    private String nombreServicio; // Muy útil para mostrar en tabla

    private Long idMecanico;
    private String nombreMecanico; // Muy útil para mostrar en tabla
}