package herencia1;

public  class  Figura {
	
	private int valor1;
	
	public Figura(int valor1) {
		this.valor1 = valor1;
	}
	
	public Figura() {
		this.valor1 = 7;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	
	public double area() {
		return 77;
	}

	@Override
	public String toString() {
		return "Figura [valor1=" + valor1 + "]";
	}
	
	
}
