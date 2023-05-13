package lista_repeticao_extra;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String resposta;
		int qtdeProduto =0;
		double precoTotal =0;
		
		do { 
			
			System.out.print("Informe o preço do produto: ");
			double preco = input.nextDouble();
			
			System.out.println("Deseja informar outro produto?");
			System.out.print("Sim ou Não: ");
			resposta = input.next();
			
			qtdeProduto++;
			precoTotal += preco; 
			
		} while (resposta.equalsIgnoreCase("Sim"));
		
		System.out.println("Você comprou " + qtdeProduto + " produtos");
		System.out.println("O preço total da compra foi: R$" + precoTotal);
		System.out.println("A média foi: R$" + precoTotal / qtdeProduto);
		
		
	input.close();
	}

}
