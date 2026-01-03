package repairShop.dto.auto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.dto.cliente.ClienteSimpleDTO;
import repairShop.models.Auto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutoResponseDTO {
    private Long id;
    private ClienteSimpleDTO cliente;
    private String marca;
    private String modelo;
    private String placa;
    private String color;

    public static AutoResponseDTO fromEntity(Auto auto){
        return AutoResponseDTO.builder()
                .id(auto.getId())
                .cliente(auto.getCliente() != null?
                        ClienteSimpleDTO.fromEntity(auto.getCliente()) : null)
                .marca(auto.getMarca())
                .modelo(auto.getModelo())
                .placa(auto.getPlaca())
                .color(auto.getColor())
                .build();

    }
}


