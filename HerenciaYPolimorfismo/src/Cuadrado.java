
public class Cuadrado extends FigurasGeometricas {
	double base=2.3;
	double altura=5;
	
	
	
	@Override //Se usa para decir que se sobreescribe el codigo y se aplica el polimorfismo
	public double calculararea() {
		area=base*altura;
		return area;
	}
}
