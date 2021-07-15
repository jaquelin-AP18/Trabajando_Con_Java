import java.util.Scanner;

/*
 * Crear un programa donde se introduzcan los tres ángulos internos de un 
 * triángulo y se determine si el triángulo es válido o no.
 * 

 * */
public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Teclear = new Scanner(System.in);
		
		int angulo1,angulo2,angulo3;
		int sumaangulos=180;
		int angulos;
		System.out.println("Ingresa los angulos del triangulo");
		
		 System.out.println("Ángulo 1:"); 
         angulo1=Teclear.nextInt();
         System.out.println("Ángulo 2:"); 
         angulo2=Teclear.nextInt();
         System.out.println("Ángulo 3:"); 
         angulo3=Teclear.nextInt();
         
         angulos=angulo1+angulo2+angulo3;
         
         if(angulos==sumaangulos) {
        	 System.out.println("La suma de los angulos es"+" "+ angulos+" "+"el Triangulo es valido"); 
         } else if(angulos>sumaangulos) {
        	 System.out.println("La suma de los angulos es"+" "+ angulos+" "+"el Triangulo no es valido"); 
         } else if (angulos<sumaangulos) {
        	 System.out.println("La suma de los angulos es"+" " +angulos+" "+"el Triangulo no es valido");
         } else {
        	 System.out.println("Los angulos son incorrectos");
         }
		

	}

}
