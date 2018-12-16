package fhnw.hackermans.shopstantlySPRING.domain.shipping;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@Configuration
public class ShippingController {

	/*@Autowired 
	private ShippingRepo shippingRepo;
	
	// Map test page
	@RequestMapping("/shipping")
	@ResponseBody
	Iterable<Shipping> getAllShippings() {
		return shippingRepo.findAll();
	}

	@RequestMapping("/addShipping")
	public @ResponseBody String addShipping(@RequestParam String orderId) {
		Shipping s = new Shipping();
		s.setEstimatedDate(new Date());
		s.setEffectiveDate(new Date());
		s.setOrderId(Integer.parseInt(orderId));
		shippingRepo.save(s);
		return "Saved";
	}*/
}
