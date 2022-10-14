package BucleDoWHile;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Piramide
		int size = 7;
		for(int i=0;i<size;i++) {
			//Espacios
			for(int j=0;j<size-i-1;j++) {
				System.out.print(" ");
			}
			//Asteriscos
			for(int j=0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
