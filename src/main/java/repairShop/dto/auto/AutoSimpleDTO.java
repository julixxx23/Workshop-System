package repairShop.dto.auto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.models.Auto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutoSimpleDTO {
    private Long id;
    private String placa;
    private String vehiculo;
    private String nombreDueno;

    public static AutoSimpleDTO fromEntity(Auto auto){
        return AutoSimpleDTO.builder()
                .id(auto.getId())
                .vehiculo(auto.getMarca() + " " +auto.getModelo())
                .placa(auto.getPlaca())
                .nombreDueno(auto.getCliente() != null?
                        auto.getCliente().getNombre() + " " + auto.getCliente().getApellido():"Sin Dueño")
                .build();
    }

}
