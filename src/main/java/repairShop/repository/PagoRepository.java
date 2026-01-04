package repairShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repairShop.models.MetodoPago;
import repairShop.models.Pago;

import java.time.LocalDateTime;
import java.util.List;

public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByPagoEstado(MetodoPago metodoPago);
    List<Pago> findByFechaPagoBetween(LocalDateTime inicio, LocalDateTime fin);
    List<Pago> findByOrdenId(Long id);
}
