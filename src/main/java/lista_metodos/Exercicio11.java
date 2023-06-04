package lista_metodos;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numeros[] = new int [10];
		
		// PREENCHER MATRIZ
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print("Informe os números que deseja guardar: ");
			numeros[i] = input.nextInt();
			
		}
		
		input.nextLine();
		System.out.print("Você deseja reorganizar esses números de forma CRESCENTE ou DECRESCENTE, informe: ");
		String ordenar = input.nextLine();
		
		ordenarNumeros(numeros, ordenar);
		
		input.close();
	}

	static void ordenarNumeros (int numeros[], String ordenar) {
		
		// ORDENAR DE FORMA CRESCENTE
		if (ordenar.equalsIgnoreCase("CRESCENTE")) {
			
			Arrays.sort(numeros);
			System.out.println("\nArray reorganizada de forma crescente: ");
			for (int i = 0; i < numeros.length; i++) {
				
				System.out.println(numeros[i]);
				
			}
			
		}
		
		// ORDENAR DE FORMA DECRESCENTE
		if (ordenar.equalsIgnoreCase("DECRESCENTE")) {
			
			for (int i = 0; i < numeros.length; i++) {
				
				numeros[i] = -numeros[i];
				
			}
			
			Arrays.sort(numeros);
			
			for (int i = 0; i < numeros.length; i++) {
				
				numeros[i] = -numeros[i];
				
			}
			
			System.out.println("\nArray reorganizada de forma decrescente: ");
			for (int i = 0; i < numeros.length; i++) {
				
				System.out.println(numeros[i]);
				
			}
			
		}
		
	}
	
}
