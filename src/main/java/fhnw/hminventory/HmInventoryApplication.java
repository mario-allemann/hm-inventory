package fhnw.hminventory;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fhnw.hminventory.domain.Warehouse;
import fhnw.hminventory.domain.WarehouseRepo;

@SpringBootApplication
public class HmInventoryApplication {

	
	private WarehouseRepo whRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(HmInventoryApplication.class, args);
	}
	
	
	// Map homepage
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "This is the homepage, faggots";
	}

	// Map test page
	@RequestMapping("/warehouse")
	@ResponseBody
	Iterable<Warehouse> getAllItems() {
		return whRepo.findAll();
	}
	
	@RequestMapping("/getFromWarehouse")
	@ResponseBody
	int getFromWarehouse(@RequestParam int prodId, @RequestParam int amount) {
		Warehouse product = whRepo.findById(prodId).get();;

		product.setAmount(product.getAmount()-amount);
		
		return product.getAmount();
		
	}
	
	

}

