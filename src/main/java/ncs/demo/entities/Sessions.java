package ncs.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Sessions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String username;

    String sessionkey;

    @Temporal(TemporalType.TIMESTAMP)
    Date date = new Date();
}
