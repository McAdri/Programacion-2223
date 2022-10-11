package bucleWhile;

public class Ejercicio05 {

	public static void main(String[] args) {
		// PRIMOS
		int numero = 42572;
		
		int i = 2;
		int divisores = 0;
		boolean divisor = false;
		while(i<numero && divisores == 0) {
			if(numero % i == 0) {
				divisores++;
				divisor = true;
			}
			i++;
		}
		if(divisores == 0) {
			System.out.println("Es primo");
		} else {
			System.out.println("NO es primo");
		}
	}

}
