package repairShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repairShop.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
