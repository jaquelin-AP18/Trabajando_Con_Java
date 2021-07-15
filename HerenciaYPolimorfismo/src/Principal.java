
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Cuadrado cuadrado=new Cuadrado();
		System.out.println("El area del cuadrado es: "+cuadrado.calculararea());
		
		Triangulo triangulo = new Triangulo(5.0,2.0);
		System.out.println("El area del triangulo es: "+triangulo.calculararea());
		
		/*Triangulo triangulo=new Triangulo();
		System.out.println("El area del triangulo es: "+triangulo.calculararea());*/
		
		Circulo circulo=new Circulo();
		System.out.println("El area del círculo es: "+circulo.calculararea());
		
		
	}

}
