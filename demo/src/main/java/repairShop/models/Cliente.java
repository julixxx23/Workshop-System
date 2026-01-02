package repairShop.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Clientes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "APELLIDO", nullable = false)
    private String apellido;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "CORREOELECTRONICO", nullable = false)
    private String correoElectronico;

    @Column(name = "TELEFONO", unique = true)
    private Long telefono;

    @Column(name = "NIT")
    private Long nit;


}