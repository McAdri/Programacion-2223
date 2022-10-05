package BucleFor;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Fibonacci
		int limite = 10;
		int peq = 0;
		int gran = 1;
		System.out.print(peq + " ");
		for(int i=1;i<10;i++) {
			System.out.print(gran + " ");
			int aux = peq;
			peq = gran;
			gran += aux;
		}
	}

}
