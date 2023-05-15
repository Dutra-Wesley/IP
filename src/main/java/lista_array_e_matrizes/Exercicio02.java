package lista_array_e_matrizes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numeros[] = new int [11];
		
		for (int i = 1; i < numeros.length; i++) {
			
			System.out.print("Informe o " + i + "º número: ");
			numeros[i] = input.nextInt();
			
		}
		
		System.out.print("Informe um outro número: ");
		int novoNumero = input.nextInt();
		
		for (int i = 1; i < numeros.length; i++) {
			
			if (novoNumero == numeros[i]) {
				
				System.out.println("ACHEI");
				
				break;
				
			} else {
				
				System.out.println("NÃO ACHEI");
				
			}
			
		}
		
	input.close();
	}

}
