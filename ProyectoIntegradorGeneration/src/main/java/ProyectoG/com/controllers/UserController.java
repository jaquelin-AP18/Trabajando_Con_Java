package ProyectoG.com.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import ProyectoG.com.Models.UserModel;
import ProyectoG.com.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
		@Autowired
		UserService userService;
		
		//Obtiene todos los usuarios
		@GetMapping
		public ArrayList<UserModel> getUsers() {
			return userService.getUsers();
		}
		
		//Guardar un usuario
		@PostMapping
		public UserModel saveUser(@RequestBody UserModel user) {
			return userService.saveUser(user);
		}
		
		//modificar
		@GetMapping(path="/{id}")
		public Optional <UserModel> getUserById(@PathVariable("id") Long id){
			return userService.getUserById(id);
		}
		
		//Eliminar un usuario
		@DeleteMapping(path="/{id}")
		public String deleteUser(@PathVariable("id") Long id) {
			boolean ok=userService.deleteUser(id);
			//ok==true es igual a ok
			if(ok) {
				return "Se elimino el usuario";
			} else {
				return "No se pudo eliminar el usuario";
			}
		}
		
		//Buescar por nombre(Se consultan datos mediante la URL)
		@GetMapping(path= "/query")
		public ArrayList<UserModel> getUsersByName(@RequestParam(value="name", defaultValue="") String name){
			return userService.getUsersByName(name);
		}

		
}
