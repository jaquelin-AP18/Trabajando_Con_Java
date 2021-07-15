
public class Gato extends Animal implements Mascota{
	
	int num_bigotes;
	String color;
	int vidas_disponibles=9;
	
	public Gato(String nombre, int edad, String color){
		super(nombre,edad);
		this.color=color;
		
	}
	
	@Override
	public String comer() {
		return "comiendo atún";
	}
	
	public String dormir() {
		return "ZZzzzzzzzzzz";
	}

	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return "Caer de pie";
	}

	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return "Dar atún";
	}

	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return "Bola de estrambre";
	}
	
	/*public String ladrar() {
		return "Guaf";
	}
	
	public String comer() {
		return "Comiendo croquetas";
	}*/

}
