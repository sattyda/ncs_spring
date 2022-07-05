package ncs.demo.repos;

import ncs.demo.entities.Sessions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KeysRepo extends JpaRepository<Sessions, Long> {
    List<Sessions> findAllByUsername(String username);
}
