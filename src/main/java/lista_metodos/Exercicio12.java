package lista_metodos;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double numeros[] = new double [2];
		String resposta;
		
		do {
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print("Informe dois números: ");
			numeros[i] = input.nextDouble();
			
		}
		
		input.nextLine();
		System.out.print("Deseja fazer a A - Adição, S- Subtração, D - Divisão ou M - Multiplação desses dois números, informe: ");
		String operacoes = input.nextLine().toUpperCase();
		
		switch (operacoes) {
		
			case "A": {
			
				double numeroSomado = adicionar(numeros);
				System.out.println("------------------");
				System.out.println(numeros[0] + " + " + numeros[1] + " = " + numeroSomado);
				System.out.println("------------------");
				break;
		
			}
			
			case "S": {
				
				double numeroSubtraido = subtrair(numeros);
				System.out.println("------------------");
				System.out.println(numeros[0] + " - " + numeros[1] + " = " + numeroSubtraido);
				System.out.println("------------------");
				break;
				
			}
			
			case "D": {
				
				double numeroDividido = dividir(numeros);
				System.out.println("------------------");
				System.out.println(numeros[0] + " / " + numeros[1] + " = " + numeroDividido);
				System.out.println("------------------");
				break;
				
			}
			
			case "M": {
				
				double numeroMultiplicado = multiplicar(numeros);
				System.out.println("------------------");
				System.out.println(numeros[0] + " * " + numeros[1] + " = " + numeroMultiplicado);
				System.out.println("------------------");
				break;
				
			}
			
		}
		
		System.out.print("Deseja informar outros dois números? S - SIM ou N -NÃO: ");
		resposta = input.nextLine();
		System.out.println();
		
		} while (resposta.equalsIgnoreCase("S"));
		
		input.close();
	}
	
	static double adicionar (double numeros[]) {
		
		double numeroSomado = numeros[0] + numeros[1];
		return numeroSomado;
		
	}
	
	static double subtrair (double numeros[]) {
		
		double numeroSubtraido = numeros[0] - numeros[1];
		return numeroSubtraido;
		
	}
	
	static double dividir (double numeros[]) {
		
		double numeroDividido = numeros[0] / numeros[1];
		return numeroDividido;
		
	}
	
	static double multiplicar (double numeros[]) {
		
		double numeroMultiplicado = numeros[0] * numeros[1];
		return numeroMultiplicado;
		
	}
	
}
