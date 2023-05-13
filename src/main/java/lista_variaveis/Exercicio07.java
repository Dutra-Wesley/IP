package lista_variaveis;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Qual o número total de eleitores de seu município: ");
		int eleitores = teclado.nextInt();
		
		System.out.println("Quantos votos em branco tiveram?: ");
		int branco = teclado.nextInt();
		
		System.out.println("Quantos votos nulos tiveram?: ");
		int nulo = teclado.nextInt();
		
		System.out.println("Quantos votos validos tiveram?: ");
		int valido = teclado.nextInt();
		
		double totalBranco = (branco * 100 / eleitores);
		System.out.println("Total de votos em branco foi: " + totalBranco + " %");
		
		double totalNulo = (nulo * 100 / eleitores);
		System.out.println("Total de votos nulo foi: " + totalNulo + " %");
		
		double totalValido = (valido * 100 / eleitores);
		System.out.println("Total de votos válidos foi: " + totalValido + " %");
		
	teclado.close();
	}

}
