
public class Perro extends Animal implements Mascota, Cuidados {
	
	String raza="";
	String color="";
	float peso=0;
	
	public Perro(String nombre, int edad){
		super(nombre,edad);
		
		
	}
	
	
	
	public String ladrar() {
		return "Guaf";
	}
	
	@Override //Se usa para decir que se sobreescribe el codigo y se aplica el polimorfismo
	public String comer() {
		return "Comiendo croquetas";
	}



	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return "Dar la patita";
	}



	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return "Recibir galleta";
	}



	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return "Jugar a la pelota";
	}



	@Override
	public String irAlVeterinario() {
		// TODO Auto-generated method stub
		return "Gato saludable";
	}



	@Override
	public String paseo() {
		// TODO Auto-generated method stub
		return "Pasear en el parque";
	}



	@Override
	public String banio() {
		// TODO Auto-generated method stub
		return "Bañarse y sacudirse";
	}

}
