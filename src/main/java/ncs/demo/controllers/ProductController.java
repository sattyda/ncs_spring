package ncs.demo.controllers;

import ncs.demo.entities.Product;
import ncs.demo.entities.Sessions;
import ncs.demo.entities.User;
import ncs.demo.services.CommonService;
import ncs.demo.utilities.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class ProductController {


    String[]  name = {"sattyda" , "fattyda"};

    HashMap<String, User> hh = new HashMap<>();


    @Autowired
    CommonService commonService;

    @RequestMapping( method = RequestMethod.POST , value = "/product/productlist")
    public ResponseEntity<Response> productlist(@RequestBody Sessions sessions){



        Response response = new Response();

        if(commonService.validateUser(sessions)){
            response.setStatus("success");

            List<Product> products = commonService.getProductList();

            response.setData(products);

            return new ResponseEntity<>(response , HttpStatus.OK);
        } else {
            response.setStatus("failure");
            return new ResponseEntity<>(response , HttpStatus.OK);
        }


    }
}
///
///
// 1.  String[] name = new String[];
//  2.  String[]  name = {"sattyda" , "fattyda};
//  3.  String[]  name = new String[]{"sattyda" , "fattyda"};
// 4.  String[]  name4 = new String{"sattyda" , "fattyda"};

// HashMap
 ///