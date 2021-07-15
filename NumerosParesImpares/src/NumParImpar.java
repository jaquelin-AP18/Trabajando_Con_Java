import java.util.Scanner;

public class NumParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		float sumaPar = 0;
		float sumaImpar=0;
		int i=1;
		
		Scanner Teclear = new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero=Teclear.nextInt();
		
		for( i=1; i<=numero; i++) 
		{
			System.out.print(i);
			if(i%2==0) 
			{
				sumaPar+=i;
				//sumaPar=sumaPar+i esto es igual a lo de arriba
			} else if (i%2==1)  
				
			{
				sumaImpar+=i;
			}
			
			
		}
		
		
		System.out.println("\n"+"La suma de los numero pares hasta" +" "+numero+" es:"+sumaPar);
		System.out.println("\n"+"La suma de los numero pares hasta" +" "+numero+" es:"+sumaImpar);
		
		
		
	}

}
