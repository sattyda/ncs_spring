package ncs.demo.controllers;

import ncs.demo.utilities.TestClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestClass testClass;

    @RequestMapping( method = RequestMethod.GET , value = "/test")
    public String index(){
        testClass.increment();
        return "seq -"+ testClass.seq;
    }
}

