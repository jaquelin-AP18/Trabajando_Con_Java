import java.util.Scanner;

public class PrimerPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaro una varible de tipo String donde se almacenara el valor
		String nombre;
		//Para leer el dato introducido por teclado se puede utilizar la clase Scanner
		Scanner Teclear = new Scanner(System.in);
		
		System.out.println("Bienvenido, ingresa tu nombre:");
		//Invocamos al metodo nextLine de clase Scanner para leer la cadena que se introduce
		nombre=Teclear.nextLine();
		
		System.out.println("\nHola, "+nombre);
		
	}

}
