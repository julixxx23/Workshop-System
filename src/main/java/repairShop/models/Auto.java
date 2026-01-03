package repairShop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "AUTOS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AUTO")
    private Long id;

    @Column(name = "MARCA", nullable = false)
    private String marca;

    @Column(name = "MODELO", nullable = false)
    private String modelo;

    @Column(name = "PLACA", nullable = false)
    private String placa;

    @Column(name = "COLOR", nullable = false)
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLIENTE")
    @ToString.Exclude
    private Cliente cliente;
}
