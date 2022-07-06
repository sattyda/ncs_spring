package ncs.demo.repos;

import ncs.demo.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders , Long> {

}
