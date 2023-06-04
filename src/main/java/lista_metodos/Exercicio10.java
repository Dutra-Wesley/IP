package lista_metodos;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		// DEFINIR TAMANHO DA ARRAY
		System.out.print("Defina a quantidade de números que deseja informar: ");
		int tamanhoArray = input.nextInt();
		
		int numeros[] = new int [tamanhoArray];
		
		// PREENCHER ARRAY
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print("Informe os números: ");
			numeros[i] = input.nextInt();
			
		}
		
		verificarMaiorEMenor(numeros);
		double mediaNumeros = calcularMedia(numeros);
		
		System.out.println("A média dos números é: " + mediaNumeros);
		
		input.close();
	}

	static void verificarMaiorEMenor (int numeros[]) {
		int maiorNumero =numeros[0];
		int menorNumero =numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] < menorNumero) {
				
				menorNumero = numeros[i];
				
			}
			
			if (numeros[i] > maiorNumero) {
				
				maiorNumero = numeros[i];
				
			}
			
		}
		
		System.out.println("O maior número informado é: " + maiorNumero);
		System.out.println("O menor número informado é: " + menorNumero);
		
	}
	
	static double calcularMedia (int numeros[]) {
		int totalNumeros =0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			totalNumeros += numeros[i];
			
		}
		
		double mediaNumeros = totalNumeros / numeros.length;
		
		return mediaNumeros;
		
	}
	
}
