package lista_repeticao_extra;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String resposta;
		double totalReceita =0;
		double totalDespesa =0;
		
		do {
			
			System.out.print("Informe o valor das receitas desse mês: ");
			double receita = input.nextDouble();
			
			System.out.println("Deseja informar outro valor?");
			System.out.print("SIM OU NÃO: ");
			resposta = input.next();
			
			totalReceita += receita;
			
		} while (resposta.equalsIgnoreCase("SIM"));
		
		do {
			
			System.out.print("Informe o valor das despesas desse mês: ");
			double despesa = input.nextDouble();
			
			System.out.println("Deseja informar outro valor?");
			System.out.print("SIM OU NÃO: ");
			resposta = input.next();
			
			totalDespesa += despesa;
			
		} while (resposta.equalsIgnoreCase("SIM"));
		
		double totalFinal = totalReceita - totalDespesa;
		
		System.out.println("O resultado desse mês é: R$" + totalFinal);
		
		if (totalReceita < totalDespesa) {
			
			System.out.println("A EMPRESA FICOU NO PREJUÍZO ESSE MÊS");
			
		} else {
			
			System.out.println("TIVEMOS UM RESULTADO POSITIVO ESSE MÊS");
			
		}
		
		
	input.close();
	}

}
