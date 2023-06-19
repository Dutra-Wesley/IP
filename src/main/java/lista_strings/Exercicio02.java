package lista_strings;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = input.nextLine();
		
		dividirFrase(frase);
		
		input.close();
	}

	static void dividirFrase(String frase) {
		
		String fraseDividida[] = frase.split(" ");
		
		for (int i = 0; i < fraseDividida.length; i++) {
			
			System.out.println(fraseDividida[i]);
			
		}
		
	}

}
