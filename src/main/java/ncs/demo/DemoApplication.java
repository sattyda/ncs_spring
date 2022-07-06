package ncs.demo;

import ncs.demo.entities.Cards;
import ncs.demo.entities.Product;
import ncs.demo.repos.CardsRepo;
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

	@Autowired
	CardsRepo cardsRepo;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public void setup(){
//		productRepo.save(new Product( null, "Old School" , 20L, "Classic Vans" , "https://png.pngitem.com/pimgs/s/680-6807721_vans-oldskool-shoes-sneakers-tumblr-trend-niche-popular.png", "Shoes" ,3000.50  ));
//		productRepo.save(new Product( null, "Monopoly" , 20L, "Team game" , "https://w7.pngwing.com/pngs/521/166/png-transparent-monopoly-deal-monopoly-plus-monopoly-junior-hasbro-monopoly-monopoly-man-game-text-logo-thumbnail.png", "Games" , 1000.50  ));
//		productRepo.save( new Product(null, "Doona S3 Liki Trike",30L, "The smallest folding trike in the market ",
//				"https://cf.shopee.sg/file/a707109ac507969504e6fcbf6ebc7f90","Kids&Babies",449.00));
//		productRepo.save( new Product(null,"Little Office Learning Center",50L,"Ages 6-36 months",
//				"https://cf.shopee.sg/file/e150f73a45791eb2e0db566bc4d6998e","Toys", 129.00));
//		productRepo.save( new Product(null, "Baby Toy Car ",100L, "kindergarten children's gift is very suitable",
//				"https://cf.shopee.sg/file/2726a0761e8989945249a9f58e36cc41","Toys", 1.00));
//		productRepo.save( new Product(null,"Toddler Activity Cube",100L,"multipurpose baby toys",
//				"https://cf.shopee.sg/file/abecfad214cf74e5b22a966213de1b9b","Toys",20.00));
//		productRepo.save( new Product(null,"kids bicycle foldable",50L," 99% assembled",
//				"https://cf.shopee.sg/file/a9b2a88e3ff90f93d7ad5e49f715868e","Kids",199.00));
//
//		productRepo.save(new Product( null, "Soccer Ball" , 20L, "This is adidas ball, blue in color" , "https://m.media-amazon.com/images/I/61qKakBk3KL._AC_SY355_.jpg", "Sports" , 1400.50  ));
//		productRepo.save(new Product( null, "Soccer Boot" , 20L, "This is adidas soccer boot, black and red in color" , "https://pyxis.nymag.com/v1/imgs/3c0/ff3/a840bb8a138585facb118688da48ed12bd.2x.rsquare.w600.jpg", "Sports" , 4400.50  ));
//		productRepo.save(new Product( null, "Jersey" , 20L, "This is Adidas Jersey, blue in color" , "https://m.media-amazon.com/images/I/51osG1SixSL._AC_SY450_.jpg", "Sports" , 2800.90  ));
//		productRepo.save(new Product( null, "Jersey" , 20L, "This is Adidas Jersey, red in color" , "https://m.media-amazon.com/images/I/51Mi0VUm0nL._AC_SX679_.jpg", "Sports" , 2100.10  ));
//		productRepo.save(new Product(null, "Xiaomi Mi Smart Band 6 Global Version Black", 100L ,"Full screen 1.56' AMOLED display has been improved all around*. Easily check text messages, calls and notifications with a quick glance.", "https://www.honorbuy.com/9880-square_medium_default/mi-band-6-global-version.jpg", "Phone", 189.0));
//		productRepo.save(new Product(null, "Edifier W820NB Bluetooth Headphone", 10L ,"Hi-Res Audio | Gaming Mode | USB Audio", "https://usa-oss.edifier.com/Uploads/images/2022/05/17/2022051710512116527558815966.jpg", "Headphone", 249.0));
//		productRepo.save(new Product( null, "Venom" , 30L, "Venom Figuring For Showcase Only " , "  https://www.nicepng.com/png/full/21-219720_spiderman-venom-png-png-freeuse-download-marvel-now.png", "Marvel" , 1500.0  ));

//		productRepo.save(new Product( null, "Azure Striker Gunvolt Striker Pack" , 30L, "A bundle holding Azure Striker Gunvolt and Azure Striker Gunvolt 2" , "https://assets-prd.ignimgs.com/2022/02/16/azurestrikergunvolt-sq-1645035298111.jpg", "Video Game" , 3000.00  ));
//		productRepo.save(new Product( null, "Gunvolt Chronicles: Luminous Avenger iX" , 20L, "A spin-off of Azure Striker Gunvolt" , "https://www.mobygames.com/images/covers/l/594428-gunvolt-chronicles-luminous-avenger-ix-nintendo-switch-front-cover.jpg", "Video Game" , 1500.00  ));
//		productRepo.save(new Product( null, "Gunvolt Chronicles: Luminous Avenger iX 2" , 20L, "A sequel to Luminous Avenger iX" , "https://www.mobygames.com/images/covers/l/594428-gunvolt-chronicles-luminous-avenger-ix-nintendo-switch-front-cover.jpg", "Video Game" , 1500.00  ));

//		productRepo.save(new Product( null, "KD 15 EP" , 20L, "Basketball Shoes" , "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/435d1f35-6bbe-42e4-bf00-d5c2de3d2b7e/kd15-ep-basketball-shoes-9K6BpD.png", "Sports" , 639.00  ));
//		productRepo.save(new Product( null, "Nike Flex Experience Run 11 Next Nature" , 20L, "Men's Road Running Shoes" , "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/4355b135-68c3-43ec-b96d-eb7d17823127/flex-experience-run-11-next-nature-road-running-shoes-rB6h46.png", "Sports" , 239.00  ));
//		productRepo.save(new Product( null, "Air Jordan 6 Retro" , 20L, "Basketball Shoes" , "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/b4bbffd7-1fe1-4a92-970e-49e1a3a54ac4/air-jordan-6-retro-shoes-4m3b9d.png", "Sports" , 775.00 ));
//		productRepo.save(new Product( null, "Lebron Witness 6 (Team)" , 20L, "Basketball Shoes" , "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/4bdee219-c49a-4194-b606-ebf5ee2fd9a1/lebron-witness-6-basketball-shoes-ddFswR.png", "Sports" , 419.00  ));
//		productRepo.save(new Product( null, "Nike Winflo 8" , 20L, "Men's Road Running Shoes" , "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/4c8395f8-68a7-4617-8264-4c252285450c/wio-8-road-running-shoes-S6jPM3.png", "Sports" , 395.00  ));
	}


}
