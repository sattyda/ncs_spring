package ncs.demo.controllers;

import ncs.demo.entities.Sessions;
import ncs.demo.entities.User;
import ncs.demo.services.CommonService;
import ncs.demo.utilities.LoginData;
import ncs.demo.utilities.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @Autowired
    CommonService commonService;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @RequestMapping( method = RequestMethod.POST , value = "/user/register")
    public ResponseEntity<Response> register(@RequestBody User user){

//        user.setPassword( bCryptPasswordEncoder.encode(user.getPassword()) );

        Response  response= new Response();

        if( commonService.saveUser(user)){
            response.setStatus("success");
        } else {
            response.setStatus("failure");
            response.setMessage("User already registered. Please login or use different username");
        }

        return new ResponseEntity<>(response , HttpStatus.OK);
    }


    @RequestMapping( method = RequestMethod.POST , value = "/user/login")
    public ResponseEntity<Response> login(@RequestBody User user ){

//        user.setPassword( bCryptPasswordEncoder.encode(user.getPassword()) );
        Response  response= new Response();

        if( commonService.loginUser(user)){
            response.setStatus("success");
            Sessions keys = new Sessions();
            keys.setSessionkey( generateRandomString( 32 ));
            keys.setUsername( user.getUsername() );

            commonService.saveKey(keys);

            LoginData loginData = new LoginData( user.getUsername(), keys.getSessionkey(), user.getMobile() );

            response.setData( loginData);

        } else {
            response.setStatus("failure");
            response.setMessage("Invalid Credentials");
        }

        return new ResponseEntity<>(response , HttpStatus.OK);
    }

    @RequestMapping( method = RequestMethod.POST , value = "/user/logout")
    public ResponseEntity<Response> logout(@RequestBody Sessions sessions ){

//        user.setPassword( bCryptPasswordEncoder.encode(user.getPassword()) );
        Response  response= new Response();

        if( commonService.logout(sessions)){
            response.setStatus("success");
        } else {
            response.setStatus("failure");
            response.setMessage("Try Again!!");
        }

        return new ResponseEntity<>(response , HttpStatus.OK);
    }

    public String generateRandomString( int length ){
        String alpha = "abcdefghijklmnopqrstuvwxyz1234567890";

        String myRandomString = "";

        int len = alpha.length()-1;

        for(int i = 0; i < length; i++ ){
            myRandomString += alpha.charAt( (int)( Math.random() * len) ) ;
        }

        return  myRandomString;
    }

}
