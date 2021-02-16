package Desafio5;

public class Aluno {
	private int cod_aluno;
	private String nom_aluno;
	
	public Aluno() {}
	
	public Aluno(int cod_aluno, String nom_aluno) {
		this.cod_aluno = cod_aluno;
		this.nom_aluno = nom_aluno;
	}

	public void exibir() {
		System.out.println("Codigo do aluno : "+cod_aluno);
		System.out.println("Nome do aluno : "+nom_aluno);
	}

	public int getCod_aluno() {
		return cod_aluno;
	}

	public void setCod_aluno(int cod_aluno) {
		this.cod_aluno = cod_aluno;
	}

	public String getNom_aluno() {
		return nom_aluno;
	}

	public void setNom_aluno(String nom_aluno) {
		this.nom_aluno = nom_aluno;
	}
	

}