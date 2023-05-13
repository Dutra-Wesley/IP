package lista_condicionais;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int anoAtual = 2023;
		
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Informe seu ano de nascimento: ");
		int anoNascimento = input.nextInt();
		
		System.out.print("Informe que ano ingressou na empresa: ");
		int ingressoEmpresa = input.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		int tempoTrabalhado = anoAtual - ingressoEmpresa;
		
		if (idade >= 65 || tempoTrabalhado >= 30) {
			
			System.out.println(nome + "|" + idade + " anos e " + tempoTrabalhado + " anos de serviço!");
			System.out.println("----------------------");
			System.out.println("REQUERER APOSENTADORIA");
		
		} else if (idade >= 60 && tempoTrabalhado >= 25) {
			
			System.out.println(nome + "|" + idade + " anos e " + tempoTrabalhado + " anos de serviço!");
			System.out.println("----------------------");
			System.out.println("REQUERER APOSENTADORIA");
			
		} else {
			
			System.out.println("NÃO REQUERER APOSENTADORIA");
			
		}
		
	input.close();
	}

}
