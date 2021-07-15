import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Ciclo While
		 * 
		 * While(condicion){
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * ------------------------
		 * 
		 * Ciclo do while
		 * 
		 * do{
		 * 	codigo
		 * 	codigo
		 * 	codigo
		 * } while(condicion)
		 * 
		 * */
//------------------------------------------------------------------------------		
		/*
		 * Escribir un programa que pia 2 numeros por consola de manera
		 * reiterada
		 * La ejecucion del programa terminara cuando los numeros ingresados
		 * sean iguales
		 * Nota: Utilizar un ciclo while*/
		
		//Declaramos objeto de tipo scanner
		Scanner leer=new Scanner(System.in);
		int numero1=0, numero2=0;//Inicializo las variables
		
		do {//Inicio el do, donde se pediran los numeros por teclado
			
				System.out.print("Ingrese numero 1: ");
	            numero1=leer.nextInt();
	            
	            System.out.print("Ingrese numero 2: ");
	            numero2=leer.nextInt();
	            
	            
            
			} while(numero1!=numero2); {//Se hace la evaluacion de los numeros ingresados
				leer.close();
				System.out.println("\nIngresaste numeros iguales");
		}
		  
		  
//------------------------------------------------------------------------------
		/*
		Scanner Teclear = new Scanner(System.in);
		int numero1 = 0, numero2 = 0;
		boolean salir=true;
		while (salir) {
			
			System.out.print("Ingrese numero 1: ");
            numero1=Teclear.nextInt();
            System.out.print("Ingrese numero 2: ");
            numero2=Teclear.nextInt();
            
            if (numero1==numero2) {
            	 salir=false;
                 System.out.println("\nEl Programa Ha Finalizado");
            	
            }
			
			
		}
		*/
		  
//------------------------------------------------------------------------------
		
		/*
		 * Scanner Teclear = new Scanner(System.in);
		double numero1=0,numero2=1;
		while (numero1!= numero2) {
			
			System.out.print("Ingrese numero 1: ");
            numero1=Teclear.nextInt();
            System.out.print("Ingrese numero 2: ");
            numero2=Teclear.nextInt();
			
			
		}
                System.out.println("Ingresaste numeros iguales");
		 * */
	}

}
