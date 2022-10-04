package HolaMundo;

import java.util.Scanner;

public class PrimerCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime tu edad: ");
		byte edadPersona = teclado.nextByte();
		if(edadPersona >= 18) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
	}

}
