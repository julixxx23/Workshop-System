package repairShop.dto.servicio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import repairShop.models.Servicio;
import repairShop.models.TipoServicio;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServicioResponseDTO {
    private Long id;
    private TipoServicio tipoServicio;
    private BigDecimal precioServicio;

    public static ServicioResponseDTO fromEntity(Servicio servicio){
        return ServicioResponseDTO.builder()
                .id(servicio.getId())
                .tipoServicio(servicio.getTipoServicio())
                .precioServicio(servicio.getPrecioServicio())
                .build();
    }
}