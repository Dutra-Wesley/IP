package lista_strings;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = input.nextLine();
		
		dividirPalavra(palavra);
		
		input.close();
	}

	static void dividirPalavra(String palavra) {
		
		String letraDividida = "";
		
		for (int i = 0; i < palavra.length(); i++) {
			
			letraDividida+= palavra.charAt(i);
			System.out.println(letraDividida);
			
		}
		
		for (int i = palavra.length() -1; i > 0; i--) {
			
			letraDividida= palavra.substring(0, i);
			System.out.println(letraDividida);
			
		}
		
	}

}
