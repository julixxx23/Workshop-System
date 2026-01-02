package repairShop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "ORDENDETALLE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrdenDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DETALLE")
    private Long id;

    @Column(name = "PRECIOUNITARIO")
    private BigDecimal precioUnitario;

    @Column(name = "SubTotal")
    private BigDecimal subTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ORDEN")
    @ToString.Exclude
    private Orden orden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SERVICIO")
    @ToString.Exclude
    private Servicio servicio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MECANICO")
    @ToString.Exclude
    private Mecanico mecanico;
}
