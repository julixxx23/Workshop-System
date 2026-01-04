package repairShop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import repairShop.models.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Búsquedas parciales
    List<Cliente> findByNombreContainingIgnoreCase(String nombre);
    List<Cliente> findByApellidoContainingIgnoreCase(String apellido);

    // Paginación con búsqueda
    Page<Cliente> findByNombreContainingIgnoreCase(String nombre, Pageable pageable);

    // Listados ordenados
    List<Cliente> findAllByOrderByNombreAsc();
    Page<Cliente> findAllByOrderByNombreAsc(Pageable pageable);

    // Búsquedas combinadas
    Optional<Cliente> findByNombreAndApellido(String nombre, String apellido);






}
