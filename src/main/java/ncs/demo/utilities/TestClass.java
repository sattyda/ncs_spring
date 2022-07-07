package ncs.demo.utilities;

import org.springframework.stereotype.Component;

@Component
public class TestClass {
    public int seq = 0;
    public TestClass() {

        seq = seq + 1;
    }

    public void increment(){
        seq = seq + 1;
    }

}
