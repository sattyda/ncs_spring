package ncs.demo;

import ncs.demo.entities.Product;
import ncs.demo.repos.ProductRepo;
import ncs.demo.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	ProductRepo productRepo;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public void setup(){

//		productRepo.save(new Product( null, "Tennis Racket" , 20L, "You play tennis with this" , "https://tennishead.net/wp-content/uploads/2019/05/Rackets-from-testing-day.jpg", "Sports" , 2000.50  ));
//		productRepo.save(new Product( null, "Tennis Racket" , 20L, "You play tennis with this" , "https://tennishead.net/wp-content/uploads/2019/05/Rackets-from-testing-day.jpg", "Sports" , 2000.50  ));
//		productRepo.save(new Product( null, "Tennis Racket" , 20L, "You play tennis with this" , "https://tennishead.net/wp-content/uploads/2019/05/Rackets-from-testing-day.jpg", "Sports" , 2000.50  ));
//		productRepo.save(new Product( null, "Tennis Racket" , 20L, "You play tennis with this" , "https://tennishead.net/wp-content/uploads/2019/05/Rackets-from-testing-day.jpg", "Sports" , 2000.50  ));
//		productRepo.save(new Product( null, "Tennis Racket" , 20L, "You play tennis with this" , "https://tennishead.net/wp-content/uploads/2019/05/Rackets-from-testing-day.jpg", "Sports" , 2000.50  ));
//		productRepo.save(new Product( null, "Tennis Racket" , 20L, "You play tennis with this" , "https://tennishead.net/wp-content/uploads/2019/05/Rackets-from-testing-day.jpg", "Sports" , 2000.50  ));
//		productRepo.save(new Product( null, "Tennis Racket" , 20L, "You play tennis with this" , "https://tennishead.net/wp-content/uploads/2019/05/Rackets-from-testing-day.jpg", "Sports" , 2000.50  ));
//		productRepo.save(new Product( null, "Tennis Racket" , 20L, "You play tennis with this" , "https://tennishead.net/wp-content/uploads/2019/05/Rackets-from-testing-day.jpg", "Sports" , 2000.50  ));
//		productRepo.save(new Product( null, "Table Tennis Racket" , 10L, "You play table tennis with this" , "https://upload.wikimedia.org/wikipedia/commons/2/26/Tabletennis.jpg", "Sports" , 78866.77  ));
//		productRepo.save(new Product( null, "Table Tennis Racket" , 10L, "You play table tennis with this" , "https://upload.wikimedia.org/wikipedia/commons/2/26/Tabletennis.jpg", "Sports" , 78866.77  ));
//		productRepo.save(new Product( null, "Table Tennis Racket" , 10L, "You play table tennis with this" , "https://upload.wikimedia.org/wikipedia/commons/2/26/Tabletennis.jpg", "Sports" , 78866.77  ));
//		productRepo.save(new Product( null, "Table Tennis Racket" , 10L, "You play table tennis with this" , "https://upload.wikimedia.org/wikipedia/commons/2/26/Tabletennis.jpg", "Sports" , 78866.77  ));
//		productRepo.save(new Product( null, "Table Tennis Racket" , 10L, "You play table tennis with this" , "https://upload.wikimedia.org/wikipedia/commons/2/26/Tabletennis.jpg", "Sports" , 78866.77  ));
//		productRepo.save(new Product( null, "Table Tennis Racket" , 10L, "You play table tennis with this" , "https://upload.wikimedia.org/wikipedia/commons/2/26/Tabletennis.jpg", "Sports" , 78866.77  ));
//		productRepo.save(new Product( null, "Table Tennis Racket" , 10L, "You play table tennis with this" , "https://upload.wikimedia.org/wikipedia/commons/2/26/Tabletennis.jpg", "Sports" , 78866.77  ));
	}


}
