
public abstract class Animal {
	String nombre="";
	int patas=0;
	int edad=0;
	
	//El constructor sirve para inicializar objetos
	public Animal(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
		
	}
	
	/*Cuando el metedo se hace abstracto se debe colocar obligatoriamente
	 * en las demas clases
	 * Cuando el metodo no es abstracto no importa si se coloca o no
	 * */
	
	
	public abstract String comer(); 
		//return "comiendo";
	
	
	public String dormir() {
		return "Zzzzzzzzzz";
	}
		//return "durmiendo";
	
}
