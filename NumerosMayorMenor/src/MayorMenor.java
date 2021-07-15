import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Debe diseñar un programa que reciba 3 números por consola y 
		 * determine cual de los 3 números es el mayor.
			Plus: Imprimir los números ordenados de mayor a menor.
			Plus: Imprimir los números ordenados de menor a mayor.

		 * */

		Scanner Teclear = new Scanner(System.in);
		 int num1,num2,num3,mayor,medio,menor; 
		 
		 
		 System.out.print("Ingrese numero 1: ");
         num1=Teclear.nextInt();
         System.out.print("Ingrese numero 2: ");
         num2=Teclear.nextInt();
         System.out.print("Ingrese numero 3: ");
         num3=Teclear.nextInt();
         
         if(num1>num2 && num1>num3) {
        	 System.out.println("\nEl numero 1:("+num1+")es mayor"); 
        	 
         } else if(num2>num1 && num2>num3) {
        	 System.out.println("\nEl numero 2:("+num2+")es mayor");
        	 
         } else if(num3>num1 && num3>num2) {
        	 System.out.println("\nEl numero 3:("+num3+")es mayor");
         }
         
         
         if((num1 > num2) && (num1 > num3)){
             mayor = num1;            
             if(num2 > num3){
               medio = num2;
               menor = num3;
             }else{
               medio = num3;
               menor = num2;
             }             
           }else{
             if(num2 > num3){
               mayor= num2;
               if(num1 > num3){
                 medio = num1;
                 menor = num3;                
               }else{
                 medio = num3;
                 menor = num1;
               }                 
             }else{
               mayor = num3;
               if(num1 > num2){
                 medio = num1;
                 menor = num2;                
               }else{
                 medio = num2;
                 menor = num1;
               } 
             } 
           }          
         System.out.println("\nDESCENDENTE : " + mayor + "," + medio + "," + menor);
         System.out.println("\nASCENDENTE : " + menor + "," + medio + "," + mayor);  
 		
 		Teclear.close();
	}
	
	

}
