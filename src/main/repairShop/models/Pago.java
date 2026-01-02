package repairShop.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PAGOS")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAGO")
    private Long id;

    @Column(name = "FECHAPAGO", nullable = false)
    private LocalDateTime fechaPago;

    @Column(name = "MONTOPAGADO",nullable = false)
    private BigDecimal montoPagado;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    @Column(name = "METODOPAGO", nullable = false)
    private MetodoPago pagoEstado = MetodoPago.PENDIENTE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ORDEN")
    @ToString.Exclude
    private Orden orden;
}
