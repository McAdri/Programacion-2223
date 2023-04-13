package herencia2;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trabajador trabajador = new Manager("yo", 99999999, true);
		
		System.out.println(trabajador instanceof Socio);
	}

}
