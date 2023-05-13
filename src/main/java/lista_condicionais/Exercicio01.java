package lista_condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas maçãs você comprou?: ");
		int maca = input.nextInt();
		
		if (maca <= 11) {
			
			System.out.println("Você comprou " + maca + " maçã/s por um total de R$" + maca * 1.30);
		
		} else {
			
			System.out.println("Você comtprou " + maca + " maçã/s por um total de R$" + maca * 1);
		}
		
	input.close();
	}

}
