package herencia1;

public class Circulo extends Figura{

	
	
	public Circulo(int valor1) {
		super(valor1);
	}
	
	public Circulo() {
		super();
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(getValor1(), 2);
	}
}
