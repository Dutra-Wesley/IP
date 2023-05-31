package lista_metodos;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int matrizA[][] = new int[3][3];

		// PREENCHIMENTO MATRIZ
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {

				System.out.print("Informe os valores da matriz na posição " + "[" + i + "]" + "[" + j + "]: ");
				matrizA[i][j] = input.nextInt();

			}
		}

		identificarMenorNumero(matrizA);
		
		input.close();
	}

	static void identificarMenorNumero (int matrizA[][]) {
		int posicaoMenorNumero[] = new int [2];
		int menorNumero =0;
		
		// VERIFICANDO MENOR NÚMERO
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				if (matrizA[i][j] < menorNumero || i == 0 ) {
					
					menorNumero = matrizA[i][j];
					posicaoMenorNumero[0] = i;
					posicaoMenorNumero[1] = j;
					
				}
				
			}
		}
		
		System.out.println("O menor número na matriz é: " + menorNumero + "\nNa posição: " + "[" + posicaoMenorNumero[0] + "]" + "[" + posicaoMenorNumero[1] + "]");
		
	}
	
}
