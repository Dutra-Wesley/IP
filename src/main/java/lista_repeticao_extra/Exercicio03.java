package lista_repeticao_extra;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double totalMetro =0;
		double totalMinuto =0;
		
		for (int i=0; i <5; i++) {
			
			System.out.print("Informe a distância (em metros) da sua última corrida: ");
			double metro = input.nextDouble();
			
			totalMetro += metro;
			
			System.out.print("Informe o tempo (em minutos) da sua última corrida: ");
			double minuto = input.nextDouble();
			
			totalMinuto += minuto;
			
		}
		
		System.out.print("Informe a distância (em metros) da sua próxima corrida: ");
		double proxCorrida = input.nextDouble();
		
		double velocidadeMedia = (totalMinuto * 60) / totalMetro;
		
		System.out.println("O tempo estimado da sua próxima corrida é " + ((proxCorrida / velocidadeMedia) / 60) + " minutos");
		
	input.close();
	}

}
