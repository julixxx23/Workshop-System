package repairShop.dto.ordendetalle;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenDetalleUpdateDTO {

    @NotNull(message = "El ID del detalle es obligatorio para actualizar")
    private Long id;

    private BigDecimal precioUnitario;
    private Long idServicio;
    private Long idMecanico;
}