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
    boolean existsByNit(Long nit);
    boolean existsByCorreoElectronico(String correo);
    Optional<Cliente> findByCorreoElectronico(String correo);
    List<Cliente> findByNombreContainingIgnoreCase(String nombre);
    List<Cliente> findByApellidoContainingIgnoreCase(String apellido);
    Page<Cliente> findByNombreContainingIgnoreCase(String nombre, Pageable pageable);
    List<Cliente> findAllByOrderByNombreAsc();
    Page<Cliente> findAllByOrderByNombreAsc(Pageable pageable);
    Optional<Cliente> findByNombreAndApellido(String nombre, String apellido);






}
