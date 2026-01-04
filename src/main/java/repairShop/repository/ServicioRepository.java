package repairShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import repairShop.models.Servicio;
import repairShop.models.TipoServicio;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
    List<Servicio> findByTipoServicio(TipoServicio tipoServicio);
    boolean existsByTipoServicio(TipoServicio tipoServicio);
    List<Servicio> findByTipoServicioNot(TipoServicio tipoServicio);
    List<Servicio> findByPrecioServicioBetween(BigDecimal min, BigDecimal max);
    List<Servicio> findByPrecioServicioLessThan(BigDecimal precio);
    List<Servicio> findByPrecioServicioGreaterThan(BigDecimal precio);
    List<Servicio> findAllByOrderByPrecioServicioAsc();
    List<Servicio> findAllByOrderByPrecioServicioDesc();
}