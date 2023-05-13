package lista_condicionais;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade atual deste produto: ");
		int produto = input.nextInt();
		
		System.out.print("Qual a quantidade mínima que este produto pode ter? : ");
		int produtoMinimo = input.nextInt();
		
		System.out.print("Qual a quantidade máxima que este produto pode ter? : ");
		int produtoMaximo = input.nextInt();
		
		int produtoMedia = (produtoMaximo + produtoMinimo) /2;
		
		if (produto >= produtoMedia) {
			
			System.out.println("NÃO É  NECESSÁRIO EFETUAR ACOMPRA DESTE  PRODUTO");
		
		} else { 
			
			System.out.println("EFETUAR A COMPRA DESTE PRODUTO");
		
		}
		
		
	input.close();
	}

}
