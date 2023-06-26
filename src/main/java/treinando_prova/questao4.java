package treinando_prova;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe quantos números deseja ler: ");
		int tamanhoArray = input.nextInt();
		
		int array[] = preencherArray(tamanhoArray);
		int maiorElemento = identificarMaiorElemento(array);
		int menorElemento = identificarMenorElemento(array);
		double mediaArray = calcularMediaArray(array);
		
		System.out.println("O maior elemento da array é: " + maiorElemento);
		System.out.println("O menor elemento da array é: " + menorElemento);
		System.out.println("A média dos valores na array é: " + mediaArray);
		
		input.close();
	}

	static double calcularMediaArray(int[] array) {
		
		double totalArray = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			totalArray += array[i];
			
		}
		
		double mediaArray = totalArray / array.length;
		
		return mediaArray;
	}

	static int identificarMenorElemento(int[] array) {
		
		int menorElemento = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < menorElemento) {
				
				menorElemento = array[i];
				
			}
			
		}
		
		return menorElemento;
	}

	static int identificarMaiorElemento(int[] array) {
		
		int maiorElemento = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > maiorElemento) {
				
				maiorElemento = array[i];
				
			}
			
		}
		
		return maiorElemento;
	}

	static int[] preencherArray(int tamanhoArray) {
		
		Scanner input = new Scanner(System.in);
		
		int array[] = new int [tamanhoArray];
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print("Informe o " + (i+1) + "º valor: ");
			array[i] = input.nextInt();
			
		}
		
		input.close();
		return array;
	}

}
