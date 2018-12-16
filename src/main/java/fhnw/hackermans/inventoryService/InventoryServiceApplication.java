package fhnw.hackermans.inventoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fhnw.hackermans.inventoryService.domain.inventory.Warehouse;
import fhnw.hackermans.inventoryService.domain.inventory.WarehouseRepo;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class InventoryServiceApplication {
	@Autowired 
	private WarehouseRepo whRepo;


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
}
