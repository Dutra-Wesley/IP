package lista_condicionais;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu código de acesso: ");
		int acesso = input.nextInt();
		
		if (acesso == 12345) {
			
			System.out.print("Digite sua senha: ");
			int senha = input.nextInt();
			
			if (senha == 54321) {
				
				System.out.println("ACESSO PERMITIDO");
				
			} else {
				
				System.out.println("ACESSO INVÁLIDO");
				
			}
			
		} else {
			
			System.out.println("ACESSO INVÁLIDO");
			
		}
	
	input.close();
	}

}
