package Negocio;

import Excecoes.CodigoNaoEncontradoException;
import Excecoes.IdadeInexistenteException;

public class Aeronave {
	private String codigo;
	private String tipo;
	private int idade;
	
	public Aeronave() {}
	
	public Aeronave(String codigo, String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}
	public Aeronave(String codigo,String tipo, int idade) {
		this(codigo, tipo);
		this.idade = idade;
	}
	public void exibir() {
		System.out.println("Codigo : "+codigo);
		System.out.println("Tipo : "+tipo);
		System.out.println("Idade : "+idade);
	}
	public void aterrisar() {
		System.out.println("Aterrisando..");
	}
	public void fazerRevisao() {
		System.out.println("Fazendo revisao...");
	}
	public void idade(int idade) throws IdadeInexistenteException {
		if(idade != 0)
			throw new IdadeInexistenteException(idade);
	}
	public void codigo(String codigo) throws CodigoNaoEncontradoException{
		if(codigo != null)
			throw new CodigoNaoEncontradoException(codigo);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
