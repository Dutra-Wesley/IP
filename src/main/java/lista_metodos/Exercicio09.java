package lista_metodos;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numeros[] = new int [10];
		
		// PREENCHIMENTO
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print("Informe os números que serão armazenados: ");
			numeros[i] = input.nextInt();
			
		}
		
		// IMPRESSÃO ARRAY ORIGINAL
		System.out.println("Array original:");
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i] + " ");
			
		}
		
		int numerosOrdenados[] = ordenarParesEImpares(numeros);
		
		// IMPRESSÃO ARRAY ORDENADA
		System.out.println("\nArray ordenada:");
		for (int i = 0; i < numerosOrdenados.length; i++) {
			
			System.out.print(numerosOrdenados[i] + " ");
			
		}
		
		input.close();
	}

	static int[] ordenarParesEImpares(int[] numeros) {
		int numerosOrdenados[] = new int [10];
		int contador =0;
		
		Arrays.sort(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] %2 == 0) {
				
				numerosOrdenados[contador] = numeros[i];
				contador++;
				
			}
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
		
			if (numeros[i] %2 != 0) {
				
				numerosOrdenados[contador] = numeros[i];
				contador++;
				
			}
			
		}
		
		return numerosOrdenados;
	}
	
}
