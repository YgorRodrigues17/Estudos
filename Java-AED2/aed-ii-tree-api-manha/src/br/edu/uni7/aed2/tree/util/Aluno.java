package br.edu.uni7.aed2.tree.util;

import java.util.Calendar;

public class Aluno {
	private Integer matricula;
	private String nome;
	private Calendar dataNascimento;

	public Aluno() {
	}

	public Aluno(Integer matricula, String nome, Calendar dataNascimento) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
