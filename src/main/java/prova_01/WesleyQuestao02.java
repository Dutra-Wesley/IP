package prova_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WesleyQuestao02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double totalValor =0;
		
		System.out.print("Informe a quantidade de garrafas de vinho: ");
		int vinho = input.nextInt();
		
		System.out.print("Informe a quantidade de garrafas de refrigerante: ");
		int refrigerante = input.nextInt();
		
		System.out.print("Informe a quantidade de garrafas de �gua: ");
		int agua = input.nextInt();
		
		if (vinho < 20000) {
			
			System.out.println("O total a pagar de vinho �: R$" + formatador.format(vinho * 50 * 0.95));
			totalValor += vinho * 50 * 0.95;
			
		} else {
			
			System.out.println("O total a pagar de vinho �: R$" + formatador.format(vinho * 50 * 0.90));
			totalValor += vinho * 50 * 0.90;
		}
		
		if (refrigerante < 10000) {
			
			System.out.println("O total a pagar de refrigerante �: R$" + formatador.format(refrigerante * 7 * 0.96));
			totalValor += refrigerante * 7 * 0.96;
			
		} else {
			
			System.out.println("O total a pagar de refrigerante �: R$" + formatador.format(refrigerante * 7 * 0.94));
			totalValor += refrigerante * 7 * 0.94;
		}
		
		System.out.println("O total a pagar de �gua �: R$" + formatador.format(agua * 3 * 0.97));
		totalValor += agua * 3 * 0.97;
		
		System.out.println("O valor total de tudo somado �: R$" + formatador.format(totalValor));
		
	input.close();
	}

}
