package lista_condicionais;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o primeiro time: ");
		String time1 = input.nextLine();
		
		System.out.print("Informe o segundo time: ");
		String time2 = input.nextLine();
		
		System.out.print("Quantos gols o " + time1 + " marcou?: ");
		int gol1 = input.nextInt();
		
		System.out.print("Quantos gols o " + time2 + " marcou?: ");
		int gol2 = input.nextInt();
		
		if (gol1 > gol2) {
			
			System.out.println("Vitória do " + time1);
		
		} else if (gol1 < gol2) {
			
			System.out.println("Vitória do " + time2);
		
		} else {
			
			System.out.println("EMPATE");
		
		}
		
		
	input.close();
	}

}
