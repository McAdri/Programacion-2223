package HolaMundo;

import java.util.Scanner;

public class Divison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer número.");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número.");
		int num2 = teclado.nextInt();
		if(num1 > num2 && num2 != 0) {
			System.out.println("El resultado es " + num1 / num2);
		} else {
			System.out.println("Nopuedo hacer eso");
		}
	}

}
