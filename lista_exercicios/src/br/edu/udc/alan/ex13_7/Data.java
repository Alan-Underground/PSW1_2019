package br.edu.udc.alan.ex13_7;

public class  Data {
	private byte dia;
	private byte mes;
	private short ano;

	public Data() {
		dia = 1;
		mes = 1;
		ano = 2019;
	}

	public void criaData(byte dia, byte mes, short ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(byte dia) {
		if (dia > 0 && dia <= 31)
			this.dia = dia;
		else
			this.dia = 0;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		if (mes >= 1 && mes <= 12)
			this.mes = mes;
		else
			this.mes = 00;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(short ano) {
		if (ano > 0)
			this.ano = ano;
		else
			this.ano = 00;
	}

	void mostrarData() {
			System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}

	public boolean eIgual(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	public boolean eAntes(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano > other.ano)
			return true;
		if (dia > other.dia)
			return true;
		if (mes > other.mes)
			return true;
		return false;
	}

	public boolean eDepois(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano < other.ano)
			return true;
		if (dia < other.dia)
			return true;
		if (mes < other.mes)
			return true;
		return false;
	}
	
	protected Data clone() {
		Data data = new Data();
		data.dia = dia;
		data.mes = mes;
		data.ano = ano;
		return data;
	}

	boolean vemAntes() {
		if (equals(clone()))
			return true;
		return false;
	}

	void dataEValida() {
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 0 && dia <= 31)
				System.out.printf("Dia valido\n");
		}
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia > 0 && dia < 31)
				System.out.printf("Dia valido\n");
		}
		if (mes == 2) {
			if ((ano % 4) == 0 && (ano % 100) != 0 && (ano % 400) == 0) {
				if (dia > 0 && dia <= 29)
					System.out.printf("Dia valido\n");
			} else if (dia > 0 && dia < 29)
				System.out.printf("Dia valido\n");
		} else
			System.out.printf("Dia invalido\n");
		if (mes > 0 && mes < 13)
			System.out.printf("Mes valido\n");
		else
			System.out.printf("Mes invalido\n");
		if (ano > 0)
			System.out.printf("Ano valido\n");
		else
			System.out.printf("Ano invalido\n");
	}

}