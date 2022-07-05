package ncs.demo.repos;

import ncs.demo.entities.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepo extends JpaRepository<Purchase , Long> {

    List<Purchase> findAllByUsernameAndOrderid(String username, Long i);
}
