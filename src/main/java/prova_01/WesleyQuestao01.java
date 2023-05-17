package prova_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WesleyQuestao01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.print("Informe o valor do prato de entrada: ");
		double pratoEntrada = input.nextDouble();
		
		System.out.print("Informe o valor do prato principal: ");
		double pratoPrincipal = input.nextDouble();
		
		System.out.print("Informe o valor da sobremesa: ");
		double sobremesa = input.nextDouble();
		
		System.out.print("Informe o valor da bebida: ");
		double bebida = input.nextDouble();
		
		double totalConta = pratoEntrada + pratoPrincipal + sobremesa + bebida;
		
		System.out.println("O valor total que voc� deve pagar �: R$" + formatador.format(totalConta * 1.10) + "\nJ� incluso os 10% de taxa do gar�om.");
		
	input.close();
	}

}
