package prova_02;

import java.util.Scanner;

public class WesleyQuestao02 {

	public static void main(String[] args) {
		
		double matrizClimatica[][] = preencherMatrizClimatica();
		double totalValoresMatriz = calcularTotalMatriz(matrizClimatica);
		double totalDiagonalMatriz = calcularDiagonalMatriz(matrizClimatica);
		double estimativaPrevisao = calcularEstimativaPrevisao(totalValoresMatriz, totalDiagonalMatriz);
		
		System.out.println("A matriz original �: ");
		
		for (int i = 0; i < matrizClimatica.length; i++) {
			for (int j = 0; j < matrizClimatica[i].length; j++) {
				
				System.out.print(matrizClimatica[i][j] + " ");
				
			}
			System.out.println();
		}

		System.out.println("A soma de todos os seus elementos �: " + totalValoresMatriz);
		System.out.println("A soma da diagonal da matriz �: " + totalDiagonalMatriz);
		System.out.println("O resultado do c�lculo da previs�o �: " + estimativaPrevisao);
		
	}

	static double calcularEstimativaPrevisao(double totalValoresMatriz, double totalDiagonalMatriz) {
		
		double estimativaPrevisao = totalValoresMatriz - totalDiagonalMatriz;
		
		return estimativaPrevisao;
	}

	static double calcularDiagonalMatriz(double[][] matrizClimatica) {
		
		double totalDiagonalMatriz = matrizClimatica[0][0] + matrizClimatica[1][1] + matrizClimatica[2][2] + matrizClimatica[3][3];
		
		return totalDiagonalMatriz;
	}

	static double calcularTotalMatriz(double[][] matrizClimatica) {
		
		double totalValoresMatriz = 0;
		
		for (int i = 0; i < matrizClimatica.length; i++) {
			for (int j = 0; j < matrizClimatica[i].length; j++) {
				
				totalValoresMatriz += matrizClimatica[i][j];
				
			}
			
		}
		
		return totalValoresMatriz;
	}

	static double[][] preencherMatrizClimatica() {
		
		Scanner input = new Scanner (System.in);
		
		double matrizClimatica[][] = new double [4][4];
		
		for (int i = 0; i < matrizClimatica.length; i++) {
			for (int j = 0; j < matrizClimatica[i].length; j++) {
				
				System.out.print("Informe o valor do ind�ce [" + i +"]" + "[" + j + "]: ");
				matrizClimatica[i][j] = input.nextDouble();
				
			}
		
		}
		
		input.close();
		return matrizClimatica;
	}

}
