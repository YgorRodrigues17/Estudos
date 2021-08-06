
public class Data2 {
	
	public Data2(){
		int dia = 1;
		int mes = 1;
		int ano = 2024;
	}
	public Data2(int d, int m,int a) {
		dia = d;
		mes = m;
		ano = a;
	}

	public Data2(int a) {
		ano = a;
	}
	
	private int dia;
	private int mes;
	private int ano;
	private Remedio2 r;
	
	public void Data2(int d, int m, int a) {
		dia = d;
		mes = m;
		ano = a;
	}
	public void mostrar() {
		System.out.println("Dia : "+dia);
		System.out.println("Mes : "+mes);
		System.out.println("Ano : "+ano);
	}
	public void setAno(int a) {
		if (a >= 2022)
			ano = a;
	}
	public void setRemedio2(Remedio2 re) {
		r = re;
	}
	public int getAno() {
		return ano;
	}
	public Remedio2 getRemedio2() {
		return r;
	}
}