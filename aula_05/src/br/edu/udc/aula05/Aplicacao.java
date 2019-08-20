package br.edu.udc.aula05;

import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Jose",123,654);
		System.out.println(pessoa);
		
		Estudante estudante = new Estudante();
		estudante.setNome("Alan");
		
		System.out.println(estudante);
		
		
		Estudante gustavo = new Estudante("Gustavo",258,159,8888);
		System.out.println(gustavo);
	}

}