package repairShop.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORDENES")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDEN")
    private Long id;

    @Column(name = "FECHAINGRESO", nullable = false)
    private LocalDateTime fechaIngreso;

    @Column(name = "OBSERVACIONES", nullable = false)
    private String observaciones;

    @Column(name = "MONTOTOTAL")
    private BigDecimal montoTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AUTO")
    @ToString.Exclude
    private Auto auto;

}
