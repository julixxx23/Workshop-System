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
public class ClienteSimpleDTO {
    private Long id;
    private String nombreCompleto;
    private String correoElectronico;

    public static ClienteSimpleDTO fromEntity(Cliente cliente){
        return ClienteSimpleDTO.builder()
                .id(cliente.getId())
                .nombreCompleto(cliente.getApellido() + " " + cliente.getApellido())
                .correoElectronico(cliente.getCorreoElectronico())
                .build();
    }
}
