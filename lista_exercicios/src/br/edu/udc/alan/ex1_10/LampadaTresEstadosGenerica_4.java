package br.edu.udc.alan.ex1_10;

import java.util.Scanner;

public class LampadaTresEstadosGenerica_4 {

		public static void main(String[] args) {
		
		int voltagem;
		int potencia;
		String cor;
		int luminosidade = 1;
		int estado=1;
		//setarEstado(luminosidade)


		
		LampadaTresEstadosGenerica_4 obj = new LampadaTresEstadosGenerica_4();
		luminosidade = obj.escolherLuminosidade(luminosidade);
		obj.imprimirLuminosidade(luminosidade);
		estado = obj.setarEstado(luminosidade);
		obj.imprimirEstado(estado);
		
		}
		
		int setarEstado (int luminosidade) {
			int estado = luminosidade;
			return estado;
		}
		
		void imprimirEstado(int estado) {
			if(estado <= 0)
				System.out.println("apagada");
			if(estado >0 && estado<=50)
				System.out.println("meia luz");
			if(estado >50)
				System.out.println("acesa");
		}
		
		
		public int escolherLuminosidade (int luminosidade) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor para a luminosidade entre 0 e 100: ");
			luminosidade = sc.nextInt();
			return luminosidade;
		}
		
		public void imprimirLuminosidade(int luminosidade) {
			int lumens = luminosidade;
			System.out.printf("A luminosidade é %d \n",lumens);
			
		}
		
		
}
