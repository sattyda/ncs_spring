package ncs.demo.repos;

import ncs.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product , Long> {

}
