
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Animal animal= new Animal();
		//System.out.println(animal.comer());
		
		Perro canelo=new Perro("Cuquis",2);
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		System.out.println(canelo.nombre);
		System.out.println(canelo.edad);
		
		Gato pulgas= new Gato("bigotes",2,"Café");
		System.out.println(pulgas.comer());
		
	}

}


//El polimorfimso permite cambiar el funcionamiento interno de los metodos 
//sobreescribiendo en las clases
