package lista_variaveis;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Infome o nome do aluno: ");
		String aluno = teclado.next();
		
		System.out.println("Informe a primeira nota do/a aluno/a " + aluno + ": ");
		double nota1 = teclado.nextDouble();
		
		System.out.println("Informe a segunda nota do/a aluno/a " + aluno + ": ");
		double nota2 = teclado.nextDouble();
		
		System.out.println("Informe a terceira nota do/a aluno/a " + aluno + ": ");
		double nota3 = teclado.nextDouble();
		
		double mediaFinal = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("A média final do/a " + aluno + " é de: " + (formatador.format(mediaFinal)));
		
	teclado.close();
	}

}
