package lista_condicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe que horas começou o jogo: ");
		int horaInicio = input.nextInt();
		
		System.out.print("Informe que horas acabou o jogo: ");
		int horaFim  = input.nextInt();
		
		int tempoJogo = horaFim - horaInicio;
		
		if (tempoJogo > 0) {
			
			System.out.println("O jogo durou " + (tempoJogo) + " horas!");
		
		}else {
			
			System.out.println("O jogo durou " + (tempoJogo + 24) + " horas!");
		} 
		
	input.close();
	}

}
