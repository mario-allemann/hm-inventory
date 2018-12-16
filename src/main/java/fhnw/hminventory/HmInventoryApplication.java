package fhnw.hminventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fhnw.hminventory.domain.Warehouse;
import fhnw.hminventory.domain.WarehouseRepo;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class HmInventoryApplication {
	@Autowired
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

}

