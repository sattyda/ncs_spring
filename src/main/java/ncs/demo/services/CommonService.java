package ncs.demo.services;

import ncs.demo.entities.*;
import ncs.demo.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    KeysRepo keysRepo;

    @Autowired
    ProductRepo productRepo;

    @Autowired
    PurchaseRepo purchaseRepo;

    @Autowired
    CardsRepo cardsRepo;

    @Autowired
    OrdersRepo ordersRepo;

    public boolean saveUser(User user) {

        try {
            List<User> users =  userRepo.findAllByUsername(user.getUsername());
            if( users.isEmpty() ){
                userRepo.save(user);
                return true;
            }  else {
                return false;
            }
        } catch(Exception ex){
            return false;
        }

    }

    public boolean loginUser(User user) {
        List<User> users =  userRepo.findAllByUsername(user.getUsername());
        if( users.isEmpty() ){
            return false;
        }  else {
            if( users.get(0).getPassword().equals(user.getPassword()) ){
                return true;
            }
        }
        return false;
    }

    public void saveKey(Sessions keys) {
        keysRepo.save(keys);
    }

    public boolean logout(Sessions sessions) {
        List<Sessions> sessionsList =  keysRepo.findAllByUsername(sessions.getUsername());
        if( sessionsList.isEmpty() ){
            return false;
        }  else {
            if( sessionsList.get(0).getSessionkey().equals(sessions.getSessionkey()) ){
                keysRepo.delete(sessionsList.get(0));
                return true;
            }
        }
        return false;

    }

    public boolean validateUser(Sessions sessions) {
        List<Sessions> sessionsList =  keysRepo.findAllByUsername(sessions.getUsername());
        if( sessionsList.isEmpty() ){
            return false;
        }  else {
            if( sessionsList.get(0).getSessionkey().equals(sessions.getSessionkey()) ){
                return true;
            }
        }
        return false;
    }

    public List<Product> getProductList() {
        return productRepo.findAll();
    }

    public void addtokart(List<Purchase> data) {
        purchaseRepo.saveAll(data);
    }

    public List<Purchase> getKartList(String username) {

        return purchaseRepo.findAllByUsernameAndOrderid(username , 0L) ;
    }

    public List<Cards> getCardsList(String username) {

        return  cardsRepo.findAllByUsername(username);
    }

    public void savecard(Cards data) {
        cardsRepo.save(data);
    }

    public void saveorder(Orders data) {
        ordersRepo.save(data);

        List<Purchase> purchases = purchaseRepo.findAllByUsernameAndOrderid(data.getUsername(), 0L) ;

        ArrayList<Purchase> arrayList = new ArrayList();
        for(int i = 0; i < purchases.size(); i++) {
            Purchase purchase = purchases.get(i);
            purchase.setOrderid(data.getId());
//            purchaseRepo.save(purchase);
            arrayList.add(purchase);
        }

        purchaseRepo.saveAll(arrayList);
    }
}
