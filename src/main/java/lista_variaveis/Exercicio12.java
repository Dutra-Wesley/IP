package lista_variaveis;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe a quantidade do saco de ração em KGs: ");
		int saco = input.nextInt();
		
		System.out.println("Quantas gramas Caramelo e Frajola comem por dia? :");
		int consumo = input.nextInt();
		
		double racao = (saco * 1000) - (consumo * 5);
				
		System.out.println("Após 5 dias alimentando o Caramelo e Frajola, restará: " + (racao) + "Kg no saco de ração!");

	input.close();
	}

}
