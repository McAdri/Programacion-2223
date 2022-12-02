package arraysMulti;

public class Ejemplo01 {

	private static int aleatorio() {
		return (int) (Math.random()*10);
	}
	
	private static String mayor(int[][] array) {
		int mayor = Integer.MIN_VALUE;
		String pos = "";
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j] > mayor) {
					mayor = array[i][j];
					pos = (i+1) +"-"+ (j+1);
				}
			}
		}
		return mayor + " " + pos;
	}
	
	private static void imprime(int[][] array) {
		int sumaTotal = 0;
		for(int i=0;i<array.length;i++) {
			int suma = 0;
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
				suma += array[i][j];
				sumaTotal += array[i][j];
			}
			System.out.print("|" + suma);
			System.out.println();
		}
		System.out.println("--------");
		
		for(int i=0;i<array.length;i++) {
			int sumaColumna = 0;
			for(int j=0;j<array.length;j++) {
				sumaColumna += array[j][i];
			}
			System.out.print(sumaColumna + " ");
		}
		System.out.print("|" + sumaTotal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[4][4];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=aleatorio();
			}
		}
		
		imprime(array);
		
	}

}
