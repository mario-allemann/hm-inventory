package fhnw.hminventory.domain;
import org.springframework.data.repository.CrudRepository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface WarehouseRepo extends CrudRepository<Warehouse, Integer> {

	
	
}
