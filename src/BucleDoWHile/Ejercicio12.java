package BucleDoWHile;

public class Ejercicio12 {

	public static void main(String[] args) {
		// V
		int size = 4;
		int numAsteriscos = 3;
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<numAsteriscos;j++) {
				System.out.print("*");
			}
			for(int j=0;j<size-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<size-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<numAsteriscos;j++) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
