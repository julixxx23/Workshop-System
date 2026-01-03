package repairShop.dto.ordendetalle;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenDetalleCreateDTO{

    @NotNull(message = "El precio unitario es obligatorio")
    @Positive(message = "El precio debe ser mayor a 0")
    private BigDecimal precioUnitario;

    @NotNull(message = "El ID de la orden es obligatorio")
    private Long idOrden;

    @NotNull(message = "El ID del servicio es obligatorio")
    private Long idServicio;

    @NotNull(message = "El ID del mecánico es obligatorio")
    private Long idMecanico;
}