package lista_repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double totalValor = 0;
		String resposta;
		int qteProduto =0;
		
		do {
		
		System.out.print("Informe o preço do produto: ");
		double valor = input.nextDouble();
		
		totalValor += valor;
		
		System.out.println("Deseja informar outro produto?");
		System.out.print("SIM OU NÃO: ");
		resposta = input.next();
		
		qteProduto++;
		
		
		}  while (resposta.equalsIgnoreCase("SIM"));
		
		System.out.println("O valor total em estoque é: R$" + formatador.format(totalValor));
		System.out.println("A média em estoque é: R$" + formatador.format(totalValor / qteProduto));
		
	input.close();
	}

}
