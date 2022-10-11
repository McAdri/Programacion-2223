package bucleWhile;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Factorial
		int num = 5;
		
		int resultado = 1;
		int i=2;
		while(i <= num) {
			resultado = resultado *i;
			i++;
		}
		System.out.println("El resultado es " + resultado);;

	}

}
