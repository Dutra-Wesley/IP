package lista_array_e_matrizes;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int menorNumero =0;
		
		int posicao[] = new int [2];
		int matrizA[][] = new int [4][4];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				System.out.print("Informe o número na posição [" + i + "][" + j + "]: ");
				matrizA[i][j] = input.nextInt();
				
				if (matrizA[i][j] < menorNumero || i == 0) {
					
					menorNumero = matrizA[i][j];
					posicao[0] = i;
					posicao[1] = j;
					
				}
			}
		}
		
		System.out.println("O menor número na matriz é: " + menorNumero + "\nA sua posição é: " + "[" + posicao[0] + "]" + "[" + posicao[1] + "]");
		
	input.close();	
	}

}
