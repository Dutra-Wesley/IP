package lista_strings;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = input.nextLine();
		
		inverterPalavra(palavra);
		
		input.close();
	}

	static void inverterPalavra(String palavra) {
		
		char palavraInvertida[] = new char [palavra.length()];
		
		palavra.getChars(0, palavra.length(), palavraInvertida, 0);
		
		for (int i = palavraInvertida.length -1 ; i >= 0; i--) {
			
			System.out.print(palavraInvertida[i]);
			
		}
		
	}

}
