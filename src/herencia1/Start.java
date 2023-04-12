package herencia1;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura fig = new Circulo();
		
		Circulo circ = new Circulo(3);
		
		Cuadrado cuad = new Cuadrado(2,4);
		
		System.out.println(fig.area());
		
		System.out.println(circ.area());
		
		System.out.println(cuad.area());
		
		System.out.println(fig.toString());
		System.out.println(circ.toString());
		System.out.println(cuad.toString());
		
		DosLados dosLados = new DosLados(3, 7);
		System.out.println(dosLados.area());
		System.out.println(dosLados.perimetro());
	}

}
