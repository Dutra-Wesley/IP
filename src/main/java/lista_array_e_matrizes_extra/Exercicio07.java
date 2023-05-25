package lista_array_e_matrizes_extra;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		String jogoVelha [][] = {{"", "", "",},{"", "", "",},{"", "", ""}};
		boolean interromper = false;
		
		for (int i = 0; i < jogoVelha.length; i++) {
			if (interromper) {
				break;
			}
			for (int j = 0; j < jogoVelha[i].length; j++) {
				
				// PREENCHIMENTO
				System.out.print("Informe a linha da sua jogada: ");
				int posicaoLinha= input.nextInt();
				System.out.print("Informe a coluna da sua jogada: ");
				int posicaoColuna= input.nextInt();
				
				input.nextLine();
				
				System.out.print("Informe X ou O: ");
				jogoVelha[posicaoLinha][posicaoColuna]= input.nextLine();
				
				System.out.println("\n--------------------");
				
				// IMPRESSÃO
				for (int line = 0; line < jogoVelha.length; line++) {
					for (int column = 0; column < jogoVelha[line].length; column++) {
						
						if (column < 2) {
							
							System.out.print(" " + jogoVelha[line][column] + " | ");
							
						} else {
							
							System.out.print(" " + jogoVelha[line][column] + " ");
							
						}
						
					}
					
					if (line < 2) {
						
						System.out.println("\n____________");
					}
					
				}
				System.out.println("\n--------------------");
				
				// VERIFICAÇÕES
				
				// LINHA 0
				if (jogoVelha[0][0].equalsIgnoreCase(jogoVelha[0][1]) && jogoVelha[0][1].equalsIgnoreCase(jogoVelha[0][2])) {
					if (jogoVelha[0][0].equalsIgnoreCase("X")) {
						
						System.out.println("O jogador do X venceu a partida - Linha 0");
						interromper = true;
						break;
						
					} else {
						
						System.out.println("O jogador do O venceu a partida - Linha 0");
						interromper = true;
						break;
					}
					
					
				}
				
				// LINHA 1
				if (jogoVelha[1][0].equalsIgnoreCase(jogoVelha[1][1]) && jogoVelha[1][1].equalsIgnoreCase(jogoVelha[1][2])) {
					if (jogoVelha[1][0].equalsIgnoreCase("X")) {
						
						System.out.println("O jogador do X venceu a partida - Linha 1");
						interromper = true;
						break;
						
					} else {
						
						System.out.println("O jogador do O venceu a partida - Linha 1");
						interromper = true;
						break;
					}
					
					
				}
				
				// LINHA 2
				if (jogoVelha[2][0].equalsIgnoreCase(jogoVelha[2][1]) && jogoVelha[0][1].equalsIgnoreCase(jogoVelha[2][2])) {
					if (jogoVelha[2][0].equalsIgnoreCase("X")) {
						
						System.out.println("O jogador do X venceu a partida - Linha 2");
						interromper = true;
						break;
						
					} else {
						
						System.out.println("O jogador do O venceu a partida - Linha 2");
						interromper = true;
						break;
					}
					
					
				}
				
				// COLUNA 0
				if (jogoVelha[0][0].equalsIgnoreCase(jogoVelha[0][1]) && jogoVelha[0][1].equalsIgnoreCase(jogoVelha[0][2])) {
					if (jogoVelha[0][0].equalsIgnoreCase("X")) {
						
						System.out.println("O jogador do X venceu a partida - Linha 0");
						interromper = true;
						break;
						
					} else {
						
						System.out.println("O jogador do O venceu a partida - Linha 0");
						interromper = true;
						break;
					}
					
					
				}
				
			}
		}
		
		
		input.close();
	}

}
