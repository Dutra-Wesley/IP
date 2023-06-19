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
		
		String conjugar1 = verbo.replace("ar", "o");
		String conjugar2 = verbo.replace("ar", "as");
		String conjugar3 = verbo.replace("ar", "a");
		String conjugar4 = verbo.replace("ar", "amos");
		String conjugar5 = verbo.replace("ar", "ais");
		String conjugar6 = verbo.replace("ar", "am");
		
		System.out.println("O verbo conjugado no presente fica:");
		System.out.println("Eu " + conjugar1);
		System.out.println("Tu " + conjugar2);
		System.out.println("Ele " + conjugar3);
		System.out.println("Nós " + conjugar4);
		System.out.println("Vós " + conjugar5);
		System.out.println("Eles " + conjugar6);
		
	}

}
