
public class Principal {
	
	static int numerador=10;
	static Integer denominador=2;
	static float division;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Antes de la división");
		try {
			division=numerador/denominador;
		} catch(ArithmeticException ex) {
			division=0;
			System.out.println("Error "+ex.getMessage());
			
		} catch(NullPointerException error) {
			division=0;
			System.out.println("Error "+error.getMessage());
			System.out.println("Segundo catch");
		}finally {
			System.out.println("Despues de la división");
		}
		
//------------------------------------------------------------------------		
	//ITERACIÓN DE LISTAS
		
		String frutas[]= {"Pera", "Manzana", "Mango", "Uva"	};
		
		/*Declaro el for
		 * El tipo de dato del arreglo
		 * La varible que se imprime
		 * Y al final se coloca el nombre del arreglo*/
		
		//foreach en Java
		for(String fruta:frutas) {
			System.out.println(fruta);
		}
		System.out.println(frutas[0]);

}
}
