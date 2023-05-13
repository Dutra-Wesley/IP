package lista_condicionais;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o nome do produto: ");
		String produto = input.nextLine();
		
		System.out.print("Quantos produtos você comprou? : ");
		int quantidade = input.nextInt();
		
		System.out.print("Informe o preço unitário: ");
		double preco = input.nextDouble();
		
		double total = quantidade * preco;
		
		if (quantidade <= 5) {
			
			System.out.println("Você comprou " + quantidade+ " " + produto + "s por um total de: R$" + (total * 0.98));
			
		} else if (quantidade > 5 && quantidade <=10) {
			
			System.out.println("Você comprou " + quantidade+ " " + produto + "s por um total de: R$" + (total * 0.97));
			
		} else {
			
			System.out.printf("Você comprou " + quantidade+ " " + produto + "s por um total de: R$" + (total * 0.95));
			
		}
		
	input.close();
	}

}
