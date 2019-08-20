package br.edu.udc.aula03;

import java.util.Scanner;

public class Aplicacao {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Fulano de Tal");
		pessoa.setRG(1234);
		pessoa.setCPF(-56789);
		
		//aula 12/08/2019 scanner sc
		Scanner sc = new Scanner(System.in);   
		
		System.out.println("Digite o nome da pessoa");
		String nome = sc.nextLine(); //pegar caracteres até que o usuário pressione enter
		System.out.println("Digite o RG da pessoa:");
		int rg = sc.nextInt(); 
		System.out.println("Digite o CPF da pessoa:");
		int cpf = sc.nextInt();
		
		Pessoa pessoa2 = new Pessoa(nome,rg,cpf); //Criação do objeto de tipo pessoa
		pessoa2.setNome(nome); //passei os valores individualmente.
		pessoa2.setRG(rg);
		pessoa2.setCPF(cpf);
		System.out.println(pessoa2);

//			System.out.println(pessoa);
		
//			System.out.println(pessoa);
	}

}

//estamos em uma determinada classe de aplicaçao com o MAIN ou seja o principal que executa o programa e 
//tem outra classe chamada Pessoa que cria objetos e não está vinculada com a interface que vou fazer, posso usar
//tanto no console quanto na interface gráfica.
//A classe pessoa é usada para resolver um problema em específico que é ser um objeto de dados, tem a definição do que é 
//uma pessoa, tem os atributos de uma pessoa e como manipular esses atributos.
//POJO ou BEAN  / Pojo é um velho objeto puro do java, a classe mais simples que tem,  BEAN tem a mesma concepção, feijão
//elemento usado para construir sistemas maiores.

//PESSOA equivale a uma struct em C, mas struct em C não impões restrições, em C podemos declarar e manipular da forma que
//quiser.  Já em Java tem os modificadores de acesso, como o private, que em conjunto com o setNome e getNome, permite
//manipular os dados.



