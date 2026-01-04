package repairShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repairShop.models.Orden;
import repairShop.models.OrdenDetalle;

import java.math.BigDecimal;
import java.util.List;

public interface OrdenDetalleRepository extends JpaRepository<OrdenDetalle, Long> {
    List<OrdenDetalle> findByOrdenId(Long id);
    List<OrdenDetalle> findByPrecioUnitario(BigDecimal precioUnitario);
}
