package repairShop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import repairShop.models.Orden;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
    List<Orden> findByFechaIngresoBetween(LocalDateTime inicio, LocalDateTime fin);
    List<Orden> findByAutoId(Long autoId);
    List<Orden> findByAutoClienteId(Long clienteId);
    List<Orden> findByMontoTotalBetween(BigDecimal min, BigDecimal max);
    List<Orden> findAllByOrderByFechaIngresoDesc();
    Page<Orden> findAllByOrderByFechaIngresoDesc(Pageable pageable);





}
