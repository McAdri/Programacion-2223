package arrays;

public class Ejercicio02 {

	private static void imprimeArray(int[] nums) {
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i] +" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Ordenar pares
		int[] numeros = {21,5,7,8,2,6,9,11,16,58};
		int[] nuevoNumeros = new int[numeros.length];
		
		int pos = 0;
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] % 2 == 0) {
				nuevoNumeros[pos] = numeros[i];
				pos++;
			}
		}
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] % 2 != 0) {
				nuevoNumeros[pos] = numeros[i];
				pos++;
			}
		}
		
		imprimeArray(nuevoNumeros);
	}

}
