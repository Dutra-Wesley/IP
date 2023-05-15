package lista_array_e_matrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String nomes[] = new String [11];
		
		for (int i = 1; i < nomes.length; i++) {
			System.out.print("Informe o " + i + "º nome: ");
			nomes[i] = input.nextLine();
			
		}
		
		for (int i = 1; i < nomes.length; i++) {
			System.out.print(nomes[i] + " ");
			
		}
		
		System.out.println("\n-----------------------");
		
		for (int i = 10 ; i >= 1; i--) {
			
			System.out.print(nomes[i] + " ");
				
		}
		
	input.close();
	}

}
