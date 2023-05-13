package lista_variaveis;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe o modelo de seu carro: ");
		String modelo = teclado.nextLine();
		
		System.out.println("Qual foi o seu custo de fábrica? :");
		double custo = teclado.nextDouble();
		
		double distribuidor = custo * 0.28;
		
		double imposto = (custo + distribuidor) *0.45;
		
		System.out.println("O seu carro de modelo " + modelo + " teve um custo final de R$" + (custo + distribuidor + imposto));
	
	teclado.close();
	}

}
