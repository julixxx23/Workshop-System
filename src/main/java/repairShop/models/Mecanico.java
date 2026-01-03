package repairShop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MECANICOS")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Mecanico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MECANICO")
    private Long id;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "APELLIDO", nullable = false)
    private String apellido;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private MecanicoDisponibilidad mecanicoDisponibilidad = MecanicoDisponibilidad.PENDIENTE;

}
