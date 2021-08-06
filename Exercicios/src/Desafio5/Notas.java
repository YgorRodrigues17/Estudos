package Desafio5;

public class Notas extends Aluno {
	private double n1;
	private double n2;
	private double n3;
	private double me;
	private double ma;
	

	
	public Notas(double n1, double n2, double n3,double me) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.me = me;
	}

	
	public Notas(int cod_aluno, String nom_aluno, double n1) {
		super(cod_aluno, nom_aluno);
		this.n1 = n1;
	}
	public Notas(int cod_aluno, String nom_aluno, double n1, double n2) {
		super(cod_aluno, nom_aluno);
		this.n2 = n2;
	}
	public Notas(int cod_aluno, String nom_aluno, double n1, double n2, double n3) {
		super(cod_aluno, nom_aluno);
		this.n3 = n3;
	}
	public Notas(int cod_aluno, String nom_aluno, double n1, double n2, double n3, double me) {
		super(cod_aluno, nom_aluno);
		this.me = me;
	}
	public void mostrar() {
		System.out.println("Nota 1 : "+n1);
		System.out.println("Nota 2 : "+n2);
		System.out.println("Nota 3 : "+n3);
		System.out.println("Media dos exercicios : "+me);
		double ma;
		ma = (((n1) + (n2 * 2) + (n3 * 3)) + me) / 7;
        System.out.println("Media de aprovetamento : "+ma);
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getMe() {
		return me;
	}

	public void setMe(double me) {
		this.me = me;
	}
	

}
