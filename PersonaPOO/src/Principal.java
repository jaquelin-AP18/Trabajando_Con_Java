
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo un objeto de tipo persona
		Persona Jaquelin = new Persona();
		//Asigno valores a mi persona
		Jaquelin.name="Jaquelin AP";
		Jaquelin.age=22;
		//Llamo a los metodos de mi clase persona
		System.out.println(Jaquelin.saludar());
		System.out.println(Jaquelin.miEdad());
		
		Persona Hassiel =new Persona();
		Hassiel.name="Hassiel M";
		Hassiel.age=38;
		System.out.println(Hassiel.saludar());
		System.out.println(Hassiel.miEdad());
		
	}

}
