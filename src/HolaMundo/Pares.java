package HolaMundo;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer número.");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número.");
		int num2 = teclado.nextInt();
		if (num1%2 == 0) {		
			System.out.println("El primer número introducido es par.");
		}		
		else {			
			System.out.println("El primer número introducido es impar.");
		}		
		if (num2%2 == 0) {			
			System.out.println("El segundo número introducido es par.");
		}		
		else {			
			System.out.println("El segundo número introducido es impar.");
		}		
		if (num1%2 == 0 && num2%2 == 0) {
			System.out.println("Ambos números introducidos son pares.");			
		}
		
		else {
			System.out.println("Alguno de los  números introducidos no es par.");
		}

	}
}
