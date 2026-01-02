package repairShop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "SERVICIO")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICIO")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPOSERVICIO", nullable = false)
    @Builder.Default
    private TipoServicio tipoServicio = TipoServicio.PENDIENTE;

    @Column(name = "PRECIOSERVICIO", nullable = false)
    private BigDecimal precioServicio;

}
