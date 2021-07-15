import java.util.Scanner;

public class SaludoFuncion {
	
	

	//Creamos un metodo publico, estatico(no se requiere instanciar ningun objeto) y de tipo string
		public static String Saludo(String nombre) {
			//String saludo=nombre;
			return "Hola,"+nombre;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				String nombre;
				Scanner Teclear = new Scanner(System.in);
				System.out.println("Bienvenido, ingresa tu nombre:");
				nombre=Teclear.nextLine();
				System.out.println(Saludo(nombre));

	}
	
	

}
