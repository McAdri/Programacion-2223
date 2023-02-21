package fracciones;

public class Fraccion {

	private int numerador;
	private int denominador;
	
	public Fraccion(int numerador,int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Fraccion sumar(Fraccion f) {
		int numerador = this.numerador * f.getDenominador() + this.denominador * f.getNumerador();
		int denominador = this.denominador * f.getDenominador();
		return new Fraccion(numerador, denominador);
	}
	
	public String toString() {
		return numerador + "/" + denominador;
	}
}
