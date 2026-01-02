package repairShop.dto.servicio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.models.Servicio;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServicioResponseDTO {
    private Long id;
    private String tipoServicio;
    private BigDecimal precio;

    public static ServicioResponseDTO fromEntity(Servicio servicio){
        return ServicioResponseDTO.builder()
                .id(servicio.getId())
                .tipoServicio(servicio.getTipoServicio().name())
                .precio(servicio.getPrecioServicio())
                .build();
    }
}
