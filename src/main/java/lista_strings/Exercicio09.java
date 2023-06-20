package lista_strings;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Informe um verbo regular terminado em (AR): ");
		String verbo = input.nextLine();
		
		conjugarVerbo(verbo);
		
		input.close();
	}

	static void conjugarVerbo(String verbo) {
		
		verbo = verbo.substring(0, verbo.length() - 2);
		
		System.out.println("\nO verbo conjugado no presente fica:");
		System.out.println("Eu " + verbo + "o");
		System.out.println("Tu " + verbo + "as");
		System.out.println("Ele " + verbo + "a");
		System.out.println("Nós " + verbo + "amos");
		System.out.println("Vós " + verbo + "áis");
		System.out.println("Eles " + verbo + "am");
		
	}

}
