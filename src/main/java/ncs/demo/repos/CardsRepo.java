package ncs.demo.repos;

import ncs.demo.entities.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardsRepo extends JpaRepository<Cards, Long> {

    List<Cards> findAllByUsername(String username);

}
