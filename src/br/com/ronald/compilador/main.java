package br.com.ronald.compilador;

public class main {

	public static void main(String[] args) {
		
		Leitor lt = new Leitor("C:\\ws-eclipse\\AnalisadorLexico\\src\\texto");
		Token token = null;
		
	do {
		token = lt.nextToken();
		if(token != null) {
			System.out.println(token);
		}
		
	} while(token != null);

	}

}
