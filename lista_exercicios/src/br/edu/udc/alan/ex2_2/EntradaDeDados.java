package br.edu.udc.alan.ex2_2;

import java.util.Scanner;

public class EntradaDeDados {
	int valor1;
	int valor2;
	int soma;
	int diferenca; 
	
	public void Entrada () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		valor1 = sc.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		valor2 = sc.nextInt();
		
		EntradaDeDados ent = new EntradaDeDados();
		int resultado = ent.Soma(valor1, valor2);
		
		System.out.println("Soma: " + resultado);
		
		resultado = ent.Diferenca(valor1, valor2);
		System.out.println("A diferença é " + resultado);
	}
	
	public  int  Soma ( int valor1 , int  valor2 ) {
		soma = valor1 + valor2;
		return soma;
	}
	
	public  int  Diferenca ( int  valor1 , int  valor2 ) {
		diferenca = valor1 - valor2;
		return diferenca;
	}
	
	

}
