package lista_repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("00.00");
		
		double valor =0;
		double totalValor =0;
	
		System.out.print("Quantas mercadorias você tem em estoque?: ");
		int estoque = input.nextInt();
		
		for (int i =1; i <= estoque; i++) {
			
			System.out.print("Digite o valor da " + (i) + "ª mercadoria: ");
			valor= input.nextDouble();
			
			totalValor = totalValor + valor;
			
		}
		
		System.out.println("O total em estoque é: R$" + totalValor);
		System.out.println("A média total é: R$" + formatador.format(totalValor / estoque));
		
	input.close();
	}

}
