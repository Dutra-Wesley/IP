package lista_array_e_matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		int numeros[] = new int [11];
		
		for (int i = 1; i < numeros.length; i++) {
			
			System.out.print("Informe o " + i + "º número: ");
			numeros[i] = input.nextInt();
			
		}
		
		Arrays.sort(numeros);
		
		for (int i = 1; i < numeros.length; i++) {
			
			System.out.print(numeros[i] + " ");
			
		}
		
	input.close();
	}

}
