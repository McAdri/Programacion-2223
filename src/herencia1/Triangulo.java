package herencia1;

public class Triangulo extends DosLados{

	public Triangulo(int valor1, int valor2) {
		super(valor1,valor2);
	}
	
	@Override
	public double area() {
		return getValor1() * getValor2() / 2;
	}
	

	@Override
	public double perimetro() {
		return 2* getValor1() +  getValor2();
	}
}
