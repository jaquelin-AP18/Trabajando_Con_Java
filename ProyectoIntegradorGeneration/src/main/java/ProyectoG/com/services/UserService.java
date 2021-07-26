package ProyectoG.com.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoG.com.Models.UserModel;
import ProyectoG.com.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;//spring gestiona la creacion de objetos
	
	
	public ArrayList<UserModel> getUsers() {
		return (ArrayList<UserModel>) userRepository.findAll();
	}
	
	
	//Solo guardamos usuarios que contengan todos los campos llenos
	public UserModel saveUser(UserModel user) {
		String name=user.getName();
		String surname=user.getSurname();
		String email=user.getEmail();
		
		if(name != null && surname != null && email !=null) {
			return userRepository.save(user);
		}
		
		return user;
	}
	
	public Optional<UserModel> getUserById(Long id) {
		return userRepository.findById(id);
	}
	
	//para borrar un elemento
	public boolean deleteUser(Long id) {
		try {
			userRepository.deleteById(id);
			return true;
		}catch (Exception error) {
			return false;
		}
	}
	
	public ArrayList<UserModel> getUsersByName(String name){
		return userRepository.findByname(name);
	}
	
	

}
