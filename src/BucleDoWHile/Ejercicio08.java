package BucleDoWHile;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Piramide numerica
		int size = 4;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print(j+1);
			}
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
