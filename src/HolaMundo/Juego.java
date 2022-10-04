package HolaMundo;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		System.out.print("JUgador 1: te toca: ");
		String jug1 = teclado.nextLine();
		System.out.print("JUgador 2: te toca: ");
		String jug2 = teclado.nextLine();
		
		if(jug1.equalsIgnoreCase(jug2)) {
			System.out.println("EMPATE");
		} else if((jug1.equals("piedra") && jug2.equals("tijera")) 
				|| (jug1.equals("papel") && jug2.equals("piedra")) 
				|| (jug1.equals("tijera") && jug2.equals("papel"))) {
			System.out.println("GANA JUGADOR 1");
		}else {
			System.out.println("GANA JUGADOR 2");
		}
	}

}
