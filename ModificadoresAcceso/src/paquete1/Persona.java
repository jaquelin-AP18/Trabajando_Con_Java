package paquete1;

public class Persona {
	//Defino atributos
	
		/*Modificador de acceso default, se puede acceder a los atributos
		y objetos dentro del mismo paquete
		*/
		String nombre="";
		
		//Modificador de acceso privado, se puede acceder solo dentro de la misma clase
		 private int edad=0;
		 
		 //Modificador protected, se puede acceder dentro de la misma clase y el mismo paquete
		  protected String domicilio="";
		  
		  //Modificador de acceso publico, se puede acceder desde la misma clase, y otros paquetes
		  public float estatura=0;
		  
		//metodo
		String saludar() {
			return "Hola mi nombre es:"+this.nombre+ "Mi edad es:"+this.edad
					+"Mi domicilio es:"+this.domicilio+"i estatura es:"+this.estatura;
		}
}
