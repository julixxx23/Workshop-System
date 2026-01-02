package repairShop.dto.auto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutoCreateDTO {
    @NotNull(message = "El ID del cliente es obligatorio")

    private Long clienteId;
    @NotBlank(message = "La marca del auto es obligatoria")
    @Size(min = 2, max = 50, message = "La marca del auto debe tener entre 2 y 50 caracteres")
    private String marca;

    @NotBlank(message = "El modelo del auto es obligatorio")
    @Size(min = 2, max = 50, message = "El modelo del auto debe tener entre 2y 50 caracteres")
    private String modelo;

    @NotBlank(message = "La placa del auto es obligatoria")
    @Size(min = 2, max = 12, message = "La placa del auto debe tener entre 2 y 12 caracteres")
    private String placa;

    @NotBlank(message = "El color del auto es obligatorio")
    @Size(min = 2, max = 20, message = "El nombre del color del auto debe tener entre 2 y 12 caracteres")
    private String color;

}
