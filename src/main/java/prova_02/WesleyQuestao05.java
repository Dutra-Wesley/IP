package prova_02;

public class WesleyQuestao05 {

	public static void main(String[] args) {
		
		String texto = new String("A epagri � uma empresa fundada em 20-11-1991. No dia 20-11-2016 a epagri comemorou 25 anos de exist�ncia, prestando um servi�o de qualidade ao povo catarinense.");
		
		String novoTexto = texto.replace("-", "/");
		
		System.out.println(novoTexto.replace("epagri", "EPAGRI"));
		
	}

}
