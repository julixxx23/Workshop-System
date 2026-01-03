package repairShop.dto.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.models.Cliente;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteResponseDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correoElectronico;
    private Long telefono;
    private Long nit;

    public static ClienteResponseDTO fromEntity(Cliente cliente){
        return ClienteResponseDTO.builder()
                .id(cliente.getId())
                .nombre(cliente.getNombre())
                .apellido(cliente.getApellido())
                .direccion(cliente.getDireccion())
                .correoElectronico(cliente.getCorreoElectronico())
                .telefono(cliente.getTelefono())
                .nit(cliente.getNit())
                .build();
    }
}
