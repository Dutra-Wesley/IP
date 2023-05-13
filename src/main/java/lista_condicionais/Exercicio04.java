package lista_condicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe quantas horas você trabalhou esse mês: ");
		int horaMes = input.nextInt();
		
		System.out.print("Informe seu sálario por hora: ");
		double salarioHora = input.nextDouble();
		
		int horaExtra = horaMes - 160;
		
		if (horaExtra == 0 ) {
			
			System.out.println("Você recebeu esse mês: R$" + (horaMes * salarioHora));
			
		} else {
			
			double salarioExtra = salarioHora * 1.5;
			System.out.print("Você recebeu esse mês: R$" + (160 * salarioHora + horaExtra * salarioExtra));
			
		}

	input.close();
	}

}
