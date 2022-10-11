package bucleWhile;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Cuadrado vacio
		int size = 4;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i == 0 || j == 0  || j == size-1 || i == size-1)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
