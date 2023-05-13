package lista_variaveis;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe sua idade em anos: ");
		int anoNascimento = teclado.nextInt();
		

		System.out.println("Informe sua idade em meses: ");
		int mesNascimento = teclado.nextInt();
		
		System.out.println("Informe sua idade em dias: ");
		int diaNascimento = teclado.nextInt();
		
		
		int idadeEmDias = anoNascimento * 365 + mesNascimento * 30 + diaNascimento;
		System.out.println("Sua idade convertida em dias é: " + (idadeEmDias));
		
	teclado.close();
	}

}
