package lista_repeticao_extra;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		String tituloMaisEmprestado = "";
		int qtdeMaisEmprestrada =0;
		String resposta;
		
		do {
			
			System.out.print("Informe o título: ");
			String titulo = input.nextLine();
			
			System.out.print("Informe o total de empréstimos: ");
			int emprestimo = input.nextInt();
			
			System.out.println("Deseja informar outro livro?");
			System.out.print("Sim ou Não: ");
			resposta = input.next();
			
			input.nextLine();
			if (emprestimo > qtdeMaisEmprestrada ) {
				
				tituloMaisEmprestado = titulo;
				qtdeMaisEmprestrada = emprestimo;
				
			}
			
			} while (resposta.equalsIgnoreCase("Sim"));
			
		System.out.println("Título mais emprestrado: " + tituloMaisEmprestado);
		System.out.println("Quantidade de empréstimos: " + qtdeMaisEmprestrada);
		
	input.close();
	}

}
