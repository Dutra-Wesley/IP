package lista_strings;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Agora digite uma palavra: ");
		String palavra = input.nextLine();
		
		contarCaracteres(palavra);
		mudarParaMaiscula(palavra);
		
		char palavraDividida[] = new char [palavra.length()];
		palavra.getChars(0, palavra.length(), palavraDividida, 0);
		identificarVogais(palavraDividida);
		
		System.out.print("Informe um termo para verificar: ");
		String termo = input.nextLine();
		
		boolean termoInicia = IdentificarTermoInicio(palavra, termo);
		
		if (termoInicia) {
			
			System.out.println("A palavra começa com o termo informado!");
			
		}
		
		boolean termoTermina = IdentificarTermoTermina(palavra, termo);
		
		if (termoTermina) {
			
			System.out.println("A palavra termina com o termo informado!");
			
		}
		
		input.close();
	}

	static boolean IdentificarTermoTermina(String palavra, String termo) {
		
		boolean termoTermina = palavra.endsWith(termo);
		
		return termoTermina;
	}

	static boolean IdentificarTermoInicio(String palavra, String termo) {
		
		boolean termoInicia = palavra.startsWith(termo);
		
		return termoInicia;
	}

	static void identificarVogais(char palavraDividida[]) {
		
		int contadorVogais = 0;
		
		for (int i = 0; i < palavraDividida.length; i++) {

			if (palavraDividida[i] == 'a') {

				contadorVogais++;

			}

			if (palavraDividida[i] == 'e') {

				contadorVogais++;

			}

			if (palavraDividida[i] == 'i') {

				contadorVogais++;

			}

			if (palavraDividida[i] == 'o') {

				contadorVogais++;

			}

			if (palavraDividida[i] == 'u') {

				contadorVogais++;

			}

		}
		
		System.out.println("Nessa palavra existem: " + contadorVogais + " vogais");
		
		
	}

	static void mudarParaMaiscula(String palavra) {
		
		System.out.println("A palavra em maiscúla fica: " + palavra.toUpperCase());
		
		
	}

	static void contarCaracteres(String palavra) {
		
		System.out.println("A palavra digitada contém: " + palavra.length() + " caracteres");
		
		
	}

}
