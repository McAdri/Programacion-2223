package herencia1;

public class Cuadrado extends Figura{

	public Cuadrado(int valor1) {
		super(valor1);
	}
	
	@Override
	public double area() {
		return getValor1() * getValor1();
	}
	
	public String soyBobo() {
		return "Es martes, bobo";
	}
}
