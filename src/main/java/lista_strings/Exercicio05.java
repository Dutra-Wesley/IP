package lista_strings;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma frase (sem acentuação): ");
		String frase = input.nextLine();

		char fraseDivididade[] = new char[frase.length()];

		frase.getChars(0, frase.length(), fraseDivididade, 0);

		int numeroVogais = contarVogais(fraseDivididade);
		
		System.out.println("A frase que você digitou foi: " + frase);
		System.out.println("Ela contém: " + numeroVogais + " vogais");

		input.close();
	}

	static int contarVogais(char[] fraseDivididade) {
		
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
		
		return contadorVogais;
		
	}

}
