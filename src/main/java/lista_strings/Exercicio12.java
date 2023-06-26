package lista_strings;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.print("Informe seu nome completo: ");
		String nome = input.nextLine();
		
		inverterNome(nome);
		
		input.close();
	}

	static void inverterNome(String nome) {
		
		String nomes[] = nome.split(" ");
		String ultimoSobreNome = nomes[nomes.length -1];
		
		System.out.print(ultimoSobreNome.toUpperCase() + ". ");
		
		for (int i = 0; i < nomes.length -1 ; i++) {
			
			if (i ==  nomes.length - 2) {
				
				System.out.print(nomes[i] + ". ");
				
			} else {
				
				System.out.print(nomes[i] + " ");
				
			}
			
		}
		
	}

}
