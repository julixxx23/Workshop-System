package repairShop.dto.orden;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdenUpdateDTO {
    @NotBlank(message = "Las observaciones son obligatorias")
    @Size(min = 2, max = 50, message = "Las observaciones deben de tener entre 2 y 50 caracteres")
    private String observaciones;



    


}
