package HolaMundo;

public class CondicionalTipo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte opcion = 5;
		switch(opcion) {
			case 1:
				System.out.println("Vale 1");
			break;
			case 2:
			case 5:
				System.out.println("VAle 2");
			break;
			default:
				System.out.println("No se que soy");
			break;
		}
	}

}
