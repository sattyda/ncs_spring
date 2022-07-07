package ncs.demo.utilities;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

@MyInterface
@Component
public class MyClass {

    public int seq = 9;

    public void increment(){
        seq++;
    }

}
