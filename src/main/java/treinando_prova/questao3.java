package treinando_prova;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		int matriz[][] = preencherMatriz();
		int totalDiagonal = somarDiagonal(matriz);
		
		System.out.println("A matriz original é: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("E a soma de sua diagonal principal é: " + totalDiagonal);
		
	}

	static int somarDiagonal(int[][] matriz) {
		
		int totalDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		
		return totalDiagonal;
	}

	static int[][] preencherMatriz() {
		
		Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int [3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print("Informe o valor de indice [" + i + "]" + "[" + j + "] da matriz: ");
				matriz[i][j] = input.nextInt();
				
			}
			
		}
		
		input.close();
		return matriz;
	}

}
