package herencia1;

public abstract class DosLados extends Figura{

	private int valor2;

	public DosLados(int valor1, int valor2) {
		super(valor1);
		this.valor2 = valor2;
	}
	
	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	@Override
	public String toString() {
		return "DosLados [valor2=" + valor2 + ", getValor1()=" + getValor1() + "]";
	}
	
	
}
