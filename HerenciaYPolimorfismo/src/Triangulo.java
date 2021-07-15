
public class Triangulo extends FigurasGeometricas {
	
	double base;
	double altura;
	
	
	public Triangulo(double b, double h) {
		this.base=b;
		this.altura=h;
		}
	
	@Override //Se usa para decir que se sobreescribe el codigo y se aplica el polimorfismo
	public double calculararea() {

		area=(base*altura)/2;
		return area;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
