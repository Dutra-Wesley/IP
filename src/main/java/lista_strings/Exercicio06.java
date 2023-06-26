package lista_strings;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = input.nextLine();
		
		System.out.print("Digite um termo: ");
		String termo = input.nextLine();
		
		contarCaracteres(palavra);
		transformarMaisculo(palavra);
		contarVogais(palavra);
		verificarComeco(palavra, termo);
		verificarFinal(palavra, termo);
		
		input.close();
	}

	static void verificarFinal(String palavra, String termo) {
		
		boolean finaL = palavra.endsWith(termo);
		
		if (finaL) {
			
			System.out.println("A palavra termina com o termo informado!");
			
		} else {
			
			System.out.println("A palavra não termina com o termo informado!");
			
		}
		
	}

	static void verificarComeco(String palavra, String termo) {
		
		boolean comeco = palavra.startsWith(termo);
		
		if (comeco) {
			
			System.out.println("A palavra começa com o termo informado!");
			
		} else {
			
			System.out.println("A palavra não começa com o termo informado!");
			
		}
		
	}

	static void contarVogais(String palavra) {
		
		char fraseDivididade[] = new char[palavra.length()];
		fraseDivididade = palavra.toCharArray();
		
		int contadorVogais = 0;

		for (int i = 0; i < fraseDivididade.length; i++) {

			if (fraseDivididade[i] == 'a' || fraseDivididade[i] == 'A') {

				contadorVogais++;

			}

			if (fraseDivididade[i] == 'e' || fraseDivididade[i] == 'E') {

				contadorVogais++;

			}

			if (fraseDivididade[i] == 'i' || fraseDivididade[i] == 'I') {

				contadorVogais++;

			}

			if (fraseDivididade[i] == 'o' || fraseDivididade[i] == 'O') {

				contadorVogais++;

			}

			if (fraseDivididade[i] == 'u' || fraseDivididade[i] == 'U') {

				contadorVogais++;

			}

		}
		
		System.out.println("A palavra possui " + contadorVogais + " vogais");
		
	}

	static void transformarMaisculo(String palavra) {
		
		System.out.println("A palavra em maiúsculo: " + palavra.toUpperCase());
		
	}

	static void contarCaracteres(String palavra) {
		
		System.out.println("O tamanho da palavra é: " + palavra.length());
		
	}
	
}
