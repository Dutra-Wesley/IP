package lista_array_e_matrizes_extra;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int totalVendas[] = new int [5];
		
		int vendas[][] = new int [5][5];
		String produtos[] = new String [5];
		String diasSemana[] = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-Feira", "Sexta-feira"};
		
		for (int i = 0; i < produtos.length; i++) {
			 
			System.out.print("Informe o nome do produto: ");
			produtos[i] = input.nextLine();
			
		}
		
		for (int i = 0; i < vendas.length; i++) {
			for (int j = 0; j < vendas[i].length; j++) {
				
				System.out.print("Informe as vendas de " + produtos[i] + " na "+ diasSemana[j] + ": ");
				vendas[i][j] = input.nextInt();
				
				totalVendas[i] += vendas[i][j];
				
			}
		}
		
		for (int i = 0; i < totalVendas.length; i++) {
			
			System.out.println("O total de vendas de " + produtos[i] + " foi: " + totalVendas[i]);
			
		}
		
		input.close();
	}

}
