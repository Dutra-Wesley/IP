package lista_condicionais;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite sua primeira nota: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Digite sua segunda nota: ");
		double nota2 = input.nextDouble();
		
		System.out.print("Digite sua terceira nota: ");
		double nota3 = input.nextDouble();
		
		System.out.print("Digite sua média dos exercícios: ");
		double mediaExercicio = input.nextDouble();
		
		double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicio) / 7;

		if (mediaAproveitamento > 9) {
			
			System.out.println("Aproveitamento A");
			
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			
			System.out.println("Aproveitamento B");
			
		}  else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			
			System.out.println("Aproveitamento C");
			
		} else if (mediaAproveitamento < 6) {
			
			System.out.println("Aproveitamento D");
			
		}
		
		
	input.close();
	}

}
