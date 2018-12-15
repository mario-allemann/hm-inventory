package fhnw.hackermans.Shopstantly.InventoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fhnw.hackermans.Shopstantly.InventoryService.domain.inventory.Warehouse;
import fhnw.hackermans.Shopstantly.InventoryService.domain.inventory.WarehouseRepo;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class InventoryServiceApplication {
	@Autowired 
	private WarehouseRepo whRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	// Map homepage
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "This is the homepage, faggots";
	}

	// Map test page
	@RequestMapping("/product")
	@ResponseBody
	Iterable<Warehouse> getAllProducts() {
		return whRepo.findAll();
	}
}
