import java.util.Scanner;

public class ControlDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * if (condicion) si se cumple{
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * }
		 * 
		 * --------------------------------------
		 * 
		 * if (condicion) si se cumple{
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * } 
		 * "si no se cumple la condidicion se ejecuta el else"
		 * else{
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * }
		 * 
		 * --------------------------------------
		 * 
		 * if(condicion) si se cumple {
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * 	}
		 * 
		 * "Si se cumple la condicion del else if se ejecuta"
		 * else if(condicion) si se cumple {
		 * 
		 * } 
		 * 
		 * "Si se cumple la condicion del else if se ejecuta"
		 * else if (condicion) si se cumple {
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * }
		 * "Si ninguna condicion se cumple ejecuta el else"
		 * else{
		 * 
		 * } 
		 * **/

		/*
		 * Se lee la edad del usuario por consola, si la edad 
		 * es mayor a 18 años, se muestra un mensaje al usuario
		 * que puede votar, en caso contrario se mostrara un mensaje
		 * indicando que no puede votar
		 */
		
		
		/*
		 Escribir un programa que pida el nombre y la edad de un participante
		 si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
		 mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
		 el programa de generation Java Full Stack".
		 En caso de no cumplirse la condición, mostrar un mensaje que diga
		 "No cumples lo requisitos para el bootcamp Java Full Stack"

		 */
		
		
		/*Scanner leerEdad= new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad=leerEdad.nextInt();
		
		String mensaje=votar(edad);
		System.out.println(mensaje);*/
		
		Scanner leerNombre=new Scanner (System.in);
		System.out.println("Bienvenido, ingresa tu nombre:");
		String nombre=leerNombre.nextLine();
		
		Scanner leerEdad=new Scanner (System.in);
		System.out.println("Ingresa tu edad");
		int edad=leerEdad.nextInt();
		
		String mensaje=programa(nombre,edad);
		System.out.println(mensaje);
	
	
	}
	
	
	/*public static String votar (int edad) {
		String mensaje="";
		if (edad >=18) {
			mensaje="Felicidades, puedes votar";
		} else {
			mensaje="Lo sentimos, no puedes votar";
		}
		return mensaje;
		
	}*/
	
	public static String programa (String nombre, int edad) {
		String mensaje="";
		if (edad>=18 && edad <=29) {
			mensaje="Felicidades,"+""+ nombre+""+" estas aceptado en el programa de generation Java Full Stack";
		} else {
			mensaje="Lo sentimos,"+""+nombre+""+"No cumples lo requisitos para el bootcamp Java Full Stack";
		}
		return mensaje;
	}

}
