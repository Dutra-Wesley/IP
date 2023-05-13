package lista_repeticao_extra;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String resposta;
		double totalAlimentacao =0;
		double totalCombustivel =0;
		double totalSaude =0;
		
		do {
			
			System.out.print("Informe o valor gasto com alimentação: ");
			double alimentacao = input.nextDouble();
			
			System.out.println("Deseja informar outro valor?");
			System.out.print("SIM OU NÃO: ");
			resposta = input.next();
			
			totalAlimentacao += alimentacao;
			
		} while (resposta.equalsIgnoreCase("SIM"));
	
		
		do {
			
			System.out.print("Informe o valor gasto com combustível: ");
			double combustivel = input.nextDouble();
			
			System.out.println("Deseja informar outro valor?");
			System.out.print("SIM OU NÃO: ");
			resposta = input.next();
			
			totalCombustivel += combustivel;
			
		} while (resposta.equalsIgnoreCase("SIM"));
		
		
		do {
			
			System.out.print("Informe o valor gasto com saúde: ");
			double saude = input.nextDouble();
			
			System.out.println("Deseja informar outro valor?");
			System.out.print("SIM OU NÃO: ");
			resposta = input.next();
			
			totalSaude += saude;
			
		} while (resposta.equalsIgnoreCase("SIM"));
		
		
		System.out.println("O total gasto no mês foi:  R$" + (totalAlimentacao + totalCombustivel + totalSaude));
		
		if (totalAlimentacao >= totalCombustivel && totalAlimentacao >= totalSaude) {
			
			System.out.println("O maior gasto foi com alimentação");
			
		} 
		
		if (totalCombustivel >= totalAlimentacao && totalCombustivel >= totalSaude) {
			
			System.out.println("O maior gasto foi com combustível");
			
		} 
		
		if (totalSaude >= totalCombustivel && totalSaude >= totalAlimentacao) {
			
			System.out.println("O maior gasto foi com saúde");
			
		}
		
		if (totalAlimentacao <= totalCombustivel && totalAlimentacao <= totalSaude) {
			
			System.out.println("O menor gasto foi com alimentação");
			
		}
		
		if (totalCombustivel <= totalAlimentacao && totalCombustivel <= totalSaude) {
			
			System.out.println("O menor gasto foi com combustível");
			
		}
		
		if (totalSaude <= totalCombustivel && totalSaude <= totalAlimentacao) {
			
			System.out.println("O menor gasto foi com saúde");
			
		}
		
	input.close();
	}

}
