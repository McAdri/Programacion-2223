package herencia1;

public class Cuadrado extends DosLados{

	public Cuadrado(int valor1, int valor2) {
		super(valor1,valor2);
	}
	
	@Override
	public double area() {
		return getValor1() * getValor2();
	}
	

	@Override
	public double perimetro() {
		return 2* getValor1() + 2* getValor2();
	}
	
	public String soyBobo() {
		return "Es martes, bobo";
	}
}
