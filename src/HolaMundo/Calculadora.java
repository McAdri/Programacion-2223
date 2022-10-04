package HolaMundo;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte num1, num2;
		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduce el primer numero:");
		num1 = teclado.nextByte();
		System.out.print("Introduce el segundo numero:");
		num2 = teclado.nextByte();
		System.out.println("Dime que quieres hacer 1.Sumar \n 2.Restar \n 3.Multiplicar \n4.Diviir");
		byte opcion = teclado.nextByte();
		
		int resultado = 0;
		if(opcion == 1) {
			resultado = (num1 + num2);
		}
		else if(opcion == 2) {
			resultado = (num1 - num2);
		}
		else if(opcion == 3) {
			resultado = (num1 * num2);
		}
		else if(opcion == 4) {
			resultado = (num1 / num2);
		}
		
		System.out.println("El resultado es: " + resultado);
		
	}

}
