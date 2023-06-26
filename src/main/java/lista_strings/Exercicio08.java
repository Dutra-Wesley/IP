package lista_strings;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite um pequeno texto: ");
		String texto = input.nextLine();
		
		System.out.print("Digite a palavra que deseja substituir no texto: ");
		String procurar = input.nextLine();
		
		System.out.print("Agora digite a palavra que deseja colocar no lugar: ");
		String novaPalavra = input.nextLine();
		
		substituirTexto(texto, procurar, novaPalavra);
		
		input.close();
	}

	static void substituirTexto(String texto, String procurar, String novaPalavra) {
		
		int posicao = texto.indexOf(procurar);
		String novoTexto = "";
		int contador = 0;
		
		while (posicao != -1) {
			
			novoTexto = texto.replace(procurar, novaPalavra);
			posicao = texto.indexOf(procurar, posicao + 1);
			contador++;
			
		}
		
		System.out.println("O texto original é: " + texto);
		System.out.println("O novo texto substituido é: " + novoTexto);
		System.out.println("A palavra foi trocada " + contador + " vezes");
		
	}

}
