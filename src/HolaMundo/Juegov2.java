package HolaMundo;

import java.util.Scanner;

public class Juegov2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		System.out.print("JUgador 1: te toca: ");
		String jug1 = teclado.nextLine();
		System.out.print("JUgador 2: te toca: ");
		String jug2 = teclado.nextLine();
		
		switch(jug1) {
			case "piedra":
				switch(jug2) {
					case "tijera":
						System.out.println("Gana 1");
					break;
					case "papel":
						System.out.println("Gana 2");
					break;
					case "piedra":
						System.out.println("EMPATE");
					break;
					default:
						System.out.println("ERROR");
					break;
				}
			break;
			case "papel":
				switch(jug2) {
				case "tijera":
					System.out.println("Gana 2");
				break;
				case "papel":
					System.out.println("EMPATE");
				break;
				case "piedra":
					System.out.println("Gana 1");
				break;
				default:
					System.out.println("ERROR");
				break;
			}
			break;
			case "tijera":
				switch(jug2) {
				case "tijera":
					System.out.println("EMPATE");
				break;
				case "papel":
					System.out.println("Gana 1");
				break;
				case "piedra":
					System.out.println("Gana 2");
				break;
				default:
					System.out.println("ERROR");
				break;
			}
			break;
			default:
				System.out.println("ERROR");
			break;
		}
		
	}

}
