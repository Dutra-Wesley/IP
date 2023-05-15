package lista_array_e_matrizes;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int matrizA [][] = new int [3][3];
		int matrizB [][] = new int [3][3];
		int matrizResultado [][] = new int [3][3];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				System.out.print("Informe o número da Matriz A na posição [" + i + "][" + j + "]: ");
				matrizA[i][j] = input.nextInt();
				
			}
		}
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				
				System.out.print("Informe o número da Matriz B na posição [" + i + "][" + j + "]: ");
				matrizB[i][j] = input.nextInt();
				
			}
		}
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
				
			}
		}
		
		System.out.println("Os valores da Matriz A são: \n");
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				System.out.print(matrizA[i][j] + " ");
				
			}
		}
		
		System.out.println("\n\nOs valores da Matriz B são: \n");
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
			
				System.out.print(matrizB[i][j] + " ");
				
			}
		}
		
		System.out.println("\n\nO resultado da soma da Matriz A e Matriz B é: \n");
		
		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[i].length; j++) {
				
				System.out.print(matrizResultado[i][j] + " ");
				
			}
		}
		
	input.close();
	}
}
