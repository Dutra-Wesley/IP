package lista_strings;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma frase (sem acentuação): ");
		String frase = input.nextLine();

		char fraseDivididade[] = new char[frase.length()];

		frase.getChars(0, frase.length(), fraseDivididade, 0);

		int contadorVogais = 0;

		for (int i = 0; i < fraseDivididade.length; i++) {

			if (fraseDivididade[i] == 'a') {

				contadorVogais++;

			}

			if (fraseDivididade[i] == 'e') {

				contadorVogais++;

			}

			if (fraseDivididade[i] == 'i') {

				contadorVogais++;

			}

			if (fraseDivididade[i] == 'o') {

				contadorVogais++;

			}

			if (fraseDivididade[i] == 'u') {

				contadorVogais++;

			}

		}
		
		System.out.println("A frase que você digitou foi: " + frase);
		System.out.println("Ela contém: " + contadorVogais + " vogais");

		input.close();
	}

}
