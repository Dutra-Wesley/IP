package lista_metodos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int matrizA[][] = new int [4][4];
		
		// PREENCHIMENTO MATRIZ
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				System.out.print("Informe os valores da matriz na posição " + "[" + i + "]" + "[" + j + "]: ");
				matrizA[i][j] = input.nextInt();
				
			}
		}
		
		int somaDiagonal = somarDiagonal(matrizA);
		
		System.out.println("A soma da diagonal é: " + somaDiagonal);
		
		input.close();
	}

	static int somarDiagonal (int matrizA[][]) {
		
		// SOMANDO DIAGONAL
		int somaDiagonal = matrizA[0][0] + matrizA[1][1] + matrizA[2][2] + matrizA[3][3];
		
		return somaDiagonal;
		
	}
	
}
