package arrays;

public class Ejemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros =new int[10];
		
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = (int) (Math.random()*51);
		}
		
		
		int mayor = 0;
		int suma = 0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] > mayor) {
				mayor = numeros[i];
			}
			suma += numeros[i];
		}
		
		System.out.println(mayor);
		System.out.println(suma/numeros.length);
		
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.print(numeros[i] + " ");
		}
	}

}
