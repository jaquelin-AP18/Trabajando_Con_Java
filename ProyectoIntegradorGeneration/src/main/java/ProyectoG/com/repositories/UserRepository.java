package ProyectoG.com.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ProyectoG.com.Models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

	public abstract ArrayList<UserModel> findByname(String name);
	
	//public abstract ArrayList<UserModel> findByemail(String email);
}
