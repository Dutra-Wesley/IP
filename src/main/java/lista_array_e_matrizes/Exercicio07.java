package lista_array_e_matrizes;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int matrizA [][] = new int [3][3];
		int matrizResultado [][] = new int [3][3];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				System.out.print("Informe o número na posição [" + i + "][" + j + "]: ");
				matrizA[i][j] = input.nextInt();
				
			}
		}
		
		System.out.print("Informe um número: ");
		int numero = input.nextInt();
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				matrizResultado[i][j] = matrizA[i][j] * numero;
				
			}
			
		}
		
		System.out.println("Os valores da Matriz A são: \n");
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				
				System.out.print(matrizA[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("\nOs valores da Matriz Resultado são: \n");
		
		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[i].length; j++) {
				
				System.out.print(matrizResultado[i][j] + " ");
				
			}
			System.out.println();
		}
		
	input.close();
	}

}
