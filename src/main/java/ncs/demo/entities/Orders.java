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
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String username;

    Double totalcost;

    String paymentstatus = "success";

    String cardnumber;

    Long productcount;

    @Temporal(TemporalType.TIMESTAMP)
    Date date = new Date();

}