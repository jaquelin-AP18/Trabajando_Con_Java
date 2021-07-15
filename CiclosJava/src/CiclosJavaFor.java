import java.util.Scanner;

public class CiclosJavaFor {
	
	public static int Tablas(int numero, int i) {
		int multi=numero*i;
		return multi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ciclo for
		 * for(variable de inicializacion; variable de inicializacion <10; variable++
		 * 
		 * */

		/*for (int i=0; i<50; i++) {
			System.out.println(i+1);
		}*/
		
		/*
		 * Crear un metodo que reciba por parametro un numero y
		 * nos muestre la tabla de multiplicar de ese numero
		 * Ejemplo:
		 * 1x1=1
		 * 1x2=2
		 * 1x3=3
		 * ..
		 * 1x10=10
		 * */
		
		Scanner Teclear = new Scanner(System.in);
		int numero;
		System.out.println("Ingresa un numero:");
		numero=Teclear.nextInt();
		System.out.println("La tabla selecciona es:"+numero);
		for (int i=1; i<=10; i++) {
			
			System.out.println(numero+" "+ "X" +" " +i+ " "+"=" +"  "+Tablas(numero,i));
		}
	}

}
