package repairShop.dto.cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteUpdateDTO {
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;

    @Size(max = 100, message = "La dirección no debe exceder los 100 caracteres")
    private String direccion;

    @Email(message = "El formato del correo electrónico es inválido")
    private String correoElectronico;

    @Pattern(regexp = "\\d{10}", message = "El teléfono debe contener exactamente 10 dígitos numéricos")
    private String telefono;

    @Pattern(regexp = "^\\d{1,12}$", message = "El NIT debe contener solo dígitos y máximo 12 caracteres")
    private String nit;
}
