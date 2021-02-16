public class Data{
	//construtores
	public Data(){
		int dia = 1;
		int mes = 1;
		int ano = 1900;
	}
	public Data(int d, int m,int a) {
		dia = d;
		mes = m;
		ano = a;
	}

	public Data(int a) {
		ano = a;
	}

	//variaveis de instancia
	private int dia;
	private int mes;
	private int ano;

	public void setDia(int d) {
		if (d > 0 && d <= 31) 
			dia = d;
	}
	public void setMes(int m) {
		if (m > 0 && m <= 12) 
			mes = m;
	}
	public void setAno(int a) {
		if (a >= 0)
			ano = a;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}



	//metodos
	public void exibir(String texto)
	{   
		System.out.println(texto);
		exibir();
	}

	public void exibir()
	{   
		System.out.println("dia ="+dia);
		System.out.println("mes ="+mes);
		System.out.println("ano ="+ano);
	}

	public void incrementarAno() {

		ano++;
	}
	public void incrementarAno(int numAnos) {

		ano+=numAnos;
	}
}
