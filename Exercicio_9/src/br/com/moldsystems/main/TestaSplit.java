package br.com.moldsystems.main;

public class TestaSplit {

	public static void main(String[] args) {

		String frase = "Socorram-me, subi no onibus em Marrocos";
		String[] palavras = frase.split(" ");
		
		for (int i = palavras.length - 1; i >= 0; i-- ) {
			System.out.println(palavras[i]);
			
		}
		
		

	}

}
