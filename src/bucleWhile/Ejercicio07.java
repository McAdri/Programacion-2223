package bucleWhile;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TABLAS CON WHILE
		int i=1;
		while(i<=10) {
			int j=1;
			System.out.println("Esta la tabla del " + i);
			while(j<=10) {
				System.out.println(i + "*" + j +"=" + (i*j));
				j++;
			}
			i++;
		}
	}

}
