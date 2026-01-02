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
public class MecanicoResponseDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String disponibilidad;

    public static MecanicoResponseDTO fromEntity(Mecanico mecanico){
        return MecanicoResponseDTO.builder()
                .id(mecanico.getId())
                .nombre(mecanico.getNombre())
                .apellido(mecanico.getApellido())
                .disponibilidad(mecanico.getMecanicoDisponibilidad().name())
                .build();
    }


}
