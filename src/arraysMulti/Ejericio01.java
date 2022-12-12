package arraysMulti;

public class Ejericio01 {

	private static int aleatorio() {
		return (int) (Math.random()*101);
	}
	
	private static String mayor(int[][] numeros) {
		int mayor = Integer.MIN_VALUE;
		String coordenadas = "";
		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros[i].length;j++) {
				if(numeros[i][j] > mayor) {
					mayor = numeros[i][j];
					coordenadas = "Fila " + (i+1) + " Columna " + (j+1);
				}
			}
		}
		
		return mayor + " " + coordenadas;
	}
	
	private static float media(int[][] array) {
		float total = 0;
		int contador = 0;
		
		for(int i=0;i<array.length;i++) {
			contador += array[i].length;
			for(int j=0;j<array[i].length;j++) {
				total += array[i][j];
				//contador++;
			}
		}
		return total / contador;
	}
	
	private static int mayoresMedia(int[][] numeros, float media) {
		int contador = 0;
		
		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros[i].length;j++) {
				if(numeros[i][j] > media(numeros))
					contador++;
					
			}
		}
		
		return contador;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[6][7];

		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j] = aleatorio();
			}
		}
		
		System.out.println("El numero mas grande es " + mayor(array));
		
		System.out.println(mayoresMedia(array, media(array)));
	}

}
