package lista_metodos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int matrizA[][] = new int [3][4];
		
		// PREENCHIMENTO MATRIZ
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				System.out.print("Informe os valores da matriz na posição " + "[" + i + "]" + "[" + j + "]: ");
				matrizA[i][j] = input.nextInt();
				
			}
		}
		
		int quantidadePares = calcularPares(matrizA);
		
		System.out.println("A quantidade de números pares são: " + quantidadePares);
		
		input.close();
	}

	static int calcularPares (int matrizA[][]) {
		int quantidadePares =0;
		
		// VERIFICANDO PAR
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				if (matrizA[i][j] %2 == 0) {
					
					quantidadePares += +1;
					
				}
				
			}
		}
		
		return quantidadePares;
		
	}
	
}
