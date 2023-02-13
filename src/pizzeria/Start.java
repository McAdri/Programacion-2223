package pizzeria;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza1 = new Pizza(TipoPizza.Barbacoa, Size.Familiar, true);
		Pizza pizza2 = new Pizza(TipoPizza.CuatroQuesos, Size.Medium, false, 7);
		
		pizza2.siguienteEstado();
		pizza2.siguienteEstado();
		pizza2.siguienteEstado();
		
		System.out.println(pizza1.ganancias());
		System.out.println(pizza2.ganancias());
	}

}
