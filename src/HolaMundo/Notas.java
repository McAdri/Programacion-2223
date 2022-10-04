package HolaMundo;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduce la nota");
		byte nota = teclado.nextByte();
		
		if(nota >= 0 && nota <= 4) {
			System.out.print("SUSPENSO");
		}
		else if(nota == 5) {
			System.out.print("APROBADO");
		}
		else if(nota == 6) {
			System.out.print("BIEN");
		}
		else if(nota >= 7 && nota <= 8){
			System.out.print("NOTABLE");
		}
		else if(nota == 9) {
			System.out.print("SOBRE");
		}
		else if(nota == 10) {
			System.out.print("MH");
		}else {
			System.out.print("ERROR");
		}
	}

}
