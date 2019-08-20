package br.edu.udc.aula03;

public class Pessoa {   //escopo da classe, tudo que estiver na classe vai enchergar o nome rg e cpf
	 private String nome;  //so pode usar nessa classe, assim n�o poder� ser alterado seu valor de outra classe
	 private int rg;		  // obrigando assim a usar o set rg, set cpf
	 private int cpf;
	
	 //posso criar quantas fun�oes eu quiser com o mesmo nome des de que os parametros sejam difernetes, (quantidade e tipo)
	 //nesse caso tenho uma com tr�s parametros e uma com um parametro, posso ter outra com tr�s parametros mas tem que
	 //ser tipos diferentes.
	 
	 //construtor cria o objeto, inicializa o objeto. se eu colocar outra coisa aqui fica errado, 
	 public Pessoa() {
		 
	 }
	 
	 
	 
	//tipo especial de metodo
	 //nao pode ter tipo   void Pessoa  n�o � contrutor,  Pessoa � construtor
	 //posso definir modificadores de acesso normlamente 
	 //como eu n�o tinha metodo construtor definido antes, o Java cria um construtor Pessoa() com valores padr�o
	 //Valores padr�o = todos numericos recebem 0, Quando estancia um objeto se n�o atribuir valor ele tem 0
	 //se tentar usar um objeto que n�o foi referenciado aparece o erro comum:"referencia a um objeto nulo" pq nao foi 
	 //dado o NEW...
	 	  
	 public Pessoa(String nome, int rg, int cpf){ //estou recebendo 3 parametros nome rg cpf, tr�s variaveis locais ao m�todo.
		 //agora tenho dois escopos nome que criei aqui dentro e nome do escopo global, se eu usar nome aqui dentro desse
		 //escopo,
		 
		 this.nome = nome; //quando uso o this o nome do escopo global la de cima recebe o nome desse sub escopo.
		 this.rg = rg;
		 if(!verificarCpf(cpf))
				return;
		 this.cpf = cpf;
		
		 
	 }
	 
	 
	static boolean verificarCpf(int cpf) {
		if(cpf>0)
			return true;
		return false;
	}
	
	public void setNome (String val) {
		nome = val;
	}
	
	public void setRG (int val) {
		rg = val;
	
	}
	
	public void setCPF (int val) {
		if(!verificarCpf(val))
			return;
		cpf = val;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
}


