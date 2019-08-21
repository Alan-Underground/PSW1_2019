package br.edu.udc.alan.ex1_10;

public class LampadaTresEstados_3 {


	public static void main(String[] args) {
	
	int voltagem;
	int potencia;
	String cor;
	int luminosidade = 1;
	//setarEstado(luminosidade)

	
	LampadaTresEstados_3 obj = new LampadaTresEstados_3();
	obj.setarEstado(luminosidade);
	
	}
	
	
	void setarEstado (int luminosidade) {
		if(luminosidade == 0)
			System.out.println("apagada");
		
		if(luminosidade == 1)
			System.out.println("meia luz");
		
		if(luminosidade == 2)
			System.out.println("acesa");
	}
}