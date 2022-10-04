package HolaMundo;

import java.util.Scanner;

public class CompararNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num1, num2;
		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduce el primer numero:");
		num1 = teclado.nextByte();
		System.out.print("Introduce el segundo numero:");
		num2 = teclado.nextByte();
		
		if(num1 > num2) {
			System.out.println("El primer numero es el mayor");
		} else {
			System.out.println("EL segundo numero es el mayor");
		}
	}

}
