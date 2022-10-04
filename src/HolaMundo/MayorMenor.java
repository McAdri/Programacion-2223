package HolaMundo;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el num1.");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el num2.");
		int num2 = teclado.nextInt();
		System.out.println("Introduce el num3.");
		int num3 = teclado.nextInt();
		
		if(num1> num2 && num1>num3) {
			System.out.println("ELmayor es el 1");
		} else if(num2>num1 && num2>num3){
			System.out.println("El mayor es el 2");
		}else {
			System.out.println("El 3 es el mayor");
		}
	}

}
