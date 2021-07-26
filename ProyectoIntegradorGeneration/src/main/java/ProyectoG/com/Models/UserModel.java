package ProyectoG.com.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Se necesita que la clase sea una entidad
@Entity
//Se agrega un nombre a la tabla
@Table(name="users")

public class UserModel {
	@Id//Es un id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Se va a generar un valor
	@Column(nullable=false)//Esta columna no puede ser nula
	private long id;
	
	@Column (nullable=false, length=100, name="name")
	private String name;
	
	@Column(nullable=false, length=100)
	private String surname;
	
	@Column(nullable=false, length=100, unique=true)
	private String email;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
