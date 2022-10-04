package HolaMundo;

import java.util.Scanner;

public class Juegov3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado =new Scanner(System.in);
		System.out.print("JUgador 1: te toca: ");
		String jug1 = teclado.nextLine();
		System.out.print("JUgador 2: te toca: ");
		String jug2 = teclado.nextLine();
		
		if(jug1.equals(jug2)) {
			System.out.println("EMPATE");
		} else{
			int ganador = 2;
			switch(jug1) {
				case "piedra":
					if(jug2.equals("tijera")) {
						ganador = 1;
					}
				break;
				case "papel":
					if(jug2.equals("piedra")){
						ganador = 1;
					}
				break;
				case "tijera":
					if(jug2.equals("papel")) {
						ganador = 1;
					}
				break;
			}
			System.out.println("EL ganador es " + ganador);
		}
	}

}
