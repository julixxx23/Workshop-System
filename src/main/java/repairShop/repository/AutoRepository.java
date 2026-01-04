package repairShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repairShop.models.Auto;

import java.util.List;
import java.util.Optional;

public interface AutoRepository extends JpaRepository<Auto, Long> {
    Optional<Auto> findByPlaca(String placa);
    boolean existsByPlaca(String placa);
    List<Auto> findByClienteId(Long clienteId);
    Optional<Auto> findByPlacaAndClienteId(String placa, Long clienteId);
}
