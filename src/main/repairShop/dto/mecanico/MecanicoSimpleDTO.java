package repairShop.dto.mecanico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.models.Mecanico;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MecanicoSimpleDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String disponibilidad;

    public static MecanicoSimpleDTO fromEntity(Mecanico mecanico){
        return MecanicoSimpleDTO.builder()
                .id(mecanico.getId())
                .nombre(mecanico.getNombre())
                .apellido(mecanico.getApellido())
                .disponibilidad(mecanico.getMecanicoDisponibilidad().name())
                .build();
    }

}
