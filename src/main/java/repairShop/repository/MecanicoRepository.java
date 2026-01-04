package repairShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repairShop.models.Mecanico;
import repairShop.models.MecanicoDisponibilidad;

import java.util.List;
import java.util.Optional;

public interface MecanicoRepository extends JpaRepository<Mecanico, Long> {
    List<Mecanico> findByNombreContainingIgnoreCase(String nombre);
    boolean existsByNombre(String nombre);
    List<Mecanico> findByMecanicoDisponibilidad(MecanicoDisponibilidad disponibilidad);
    long countByMecanicoDisponibilidad(MecanicoDisponibilidad disponibilidad);
}
