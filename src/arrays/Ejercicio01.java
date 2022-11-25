package arrays;

public class Ejercicio01 {

	private static void imprimeArray(int[] nums) {
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i] +" ");
		System.out.println();
	}
	
	private static int[] sustituye(int[] nums,int num1,int num2) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == num1)
				nums[i] = num2;
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		// Reemplazar
		
		int[] numeros = new int[100];
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = (int) (Math.random()*21);
		}

		imprimeArray(numeros);
		
		int numeroBuscar = 7;
		int numeroReemplaza = 12;
		
		sustituye(numeros, numeroBuscar, numeroReemplaza);
		
		imprimeArray(numeros);
		
	}

}
