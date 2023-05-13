package lista_repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		String resposta;
		double totalSalario =0;
		double totalFilho =0;
		int totalHabitantes =0;
		double maiorSalario =0;
		int percentual =0;
		
		do {
			
			System.out.print("Informe o salário: ");
			double salario = input.nextDouble();
			
			totalSalario += salario;
			
			System.out.print("Informe o total de filhos: ");
			int filho = input.nextInt();
			
			totalFilho += filho;
			
			System.out.println("Deseja informar outro habitante?");
			System.out.print("SIM OU NÃO: ");
			resposta = input.next();
			
			totalHabitantes++;
			
			if (salario > maiorSalario) {
				
				maiorSalario = salario;
				
			}
			
			if (salario < 1000) {
				
				percentual++;
				
			}
			
		} while (resposta.equalsIgnoreCase("SIM"));
		
		System.out.println("A média do salário dos habitantes é: R$" + formatador.format(totalSalario / totalHabitantes));
		System.out.println("A média de filhos dos habitantes é: " + formatador.format(totalFilho / totalHabitantes) + "%");
		System.out.println("O maior salário entre os habitantes é: R$" + formatador.format(maiorSalario));
		System.out.println("O percentual de habitantes com salário menor que R$1000,00 é: " + formatador.format(percentual * 100 / totalHabitantes) + "%");
		
		
	input.close();
	}

}
