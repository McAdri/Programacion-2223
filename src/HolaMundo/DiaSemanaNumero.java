package HolaMundo;

import java.util.Scanner;

public class DiaSemanaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el dia.");
		byte dia = teclado.nextByte();
		if(dia>0 && dia <= 4) {
			System.out.println("QUe rollo");
		} else if(dia == 5) {
			System.out.println("FINDE");
		} else if(dia>5 && dia<=7){
			System.out.println("CERVEZAAAAA");
		} else {
			System.out.println("ERRORRRRRRR");
		}
	}

}
