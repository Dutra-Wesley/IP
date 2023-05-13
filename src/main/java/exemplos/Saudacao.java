package exemplos;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma mensagem: ");
		String mensagem = teclado.nextLine();
		System.out.println(mensagem);
		teclado.close();
		//identação automática ctrl+shift+f
		//comentários sempre com "//"
		//ctrl+espaço gera comando automaticamente
		//achar bibliotecas dentro do java ctrl+espaço

	}
}