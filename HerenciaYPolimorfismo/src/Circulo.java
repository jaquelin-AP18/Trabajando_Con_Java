
public class Circulo extends FigurasGeometricas {

	
	double pi=3.1416;
	double radio=5;
	
	
	@Override //Se usa para decir que se sobreescribe el codigo y se aplica el polimorfismo
	public double calculararea() {
		area=pi*radio*radio;
		return area;
	}
	
}
