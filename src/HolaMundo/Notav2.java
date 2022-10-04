package HolaMundo;

public class Notav2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte nota = 7;
		switch(nota) {
			case 0, 1, 2, 3, 4:
			 System.out.println("SUSPENSO");
			break;
			case 5:
				System.out.println("APORBADO");
			break;
			case 6:
				System.out.println("BIEN");
			break;
			case 7:
			case 8:
				System.out.println("NOTABLE");
			break;
			case 9:
				System.out.println("SOBRE");
			break;
			case 10:
				System.out.println("MH");
			break;
			default:
				System.out.println("ERROR");
			break;
		}
	}

}
