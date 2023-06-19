package lista_strings;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = input.nextLine();
		
		contarPalavras(frase);
		
		input.close();
	}

	static void contarPalavras(String frase) {
		
		String fraseDividida[] = frase.split(" ");
		
		System.out.println("Você digitou " + fraseDividida.length + " palavras");
		
	}

}
