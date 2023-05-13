package lista_variaveis;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe quantos carros você vendeu esse mês? :");
		int carro = teclado.nextInt();
		
		System.out.println("Qual o valor total de suas vendas? :");
		double venda = teclado.nextDouble();
		
		System.out.println("Qual o seu salário fixo? :");
		double salario = teclado.nextDouble();
		
		System.out.println("Informe o valor que você recebe por cada carro vendido? :");
		double comissao = teclado.nextDouble();
		
		double comissaoFinal = comissao * carro;
		
		double porcentagem = venda * 0.05;
		
		double salarioFinal = salario + comissaoFinal + porcentagem;
		
		System.out.println("Seu salário final foi de R$" + salarioFinal);
		
	teclado.close();
	}

}
