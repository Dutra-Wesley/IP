package lista_condicionais_extra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("00.00");
		
		double pesoIdeal = 0;
		
		System.out.println("H - HOMEM");
		System.out.println("M - MULHER");
		System.out.print("Digite seu sexo: ");
		String sexo = input.nextLine().toUpperCase();
		
		System.out.print("Digite sua altura: ");
		double altura = input.nextDouble();
		
		
		switch (sexo) {
		
		case "H":
			
			pesoIdeal = (72.7 * altura) - 58;
			
			break;
			
			
		case "M":
			
			pesoIdeal = (62.1 * altura) - 44.7;
			
			break;
			
			
		default: 
			
			System.out.println("Opção Inválida");
			break;
			
		}
		
		
		System.out.println("Seu peso ideal é de: " + formatador.format(pesoIdeal) + "Kg");
		
	input.close();
	}

}
