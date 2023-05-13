package lista_variaveis;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe seu salário atual?: ");
		double salarioAtual = teclado.nextDouble();
		
		System.out.println("Quanto vai ser a porcentagem de seu aumento?: ");
		double aumento = teclado.nextDouble();
		
		double novoSalario = (aumento * salarioAtual) + salarioAtual;
		
		System.out.println("Seu salário atual é de " + salarioAtual + "R$" + " e seu novo salário é " + novoSalario + "R$");
		
	teclado.close();
	}

}
