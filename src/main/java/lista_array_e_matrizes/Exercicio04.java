package lista_array_e_matrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int maiorNumero =0;
		int menorNumero =0;
		
		int numeros[] = new int [11];
		
		for (int i = 1; i < numeros.length; i++) {
			
			System.out.print("Informe o " + i + "º número: ");
			numeros[i] = input.nextInt();
			
			if (numeros[i] <= 0) {
				
				do {
					
					System.out.print("Digite apenas números positivos: ");
					numeros[i] = input.nextInt();
					
				} while (numeros[i] <= 0);
				
			}
			
		}
		
		for (int i = 1; i < numeros.length; i++) {
			
			if (numeros[i] > maiorNumero) {
				
				maiorNumero = numeros[i];
				
			}
			
			if (numeros[i] < menorNumero || i == 1 ) {
				
				menorNumero = numeros[i];
				
			}
		}
		
		System.out.println("O menor número digitado foi: " + menorNumero);
		System.out.println("O maior número digitado foi: " + maiorNumero);
		
	input.close();	
	}

}
