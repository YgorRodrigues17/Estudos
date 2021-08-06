package Excecoes;

public class CodigoNaoEncontradoException extends Exception{
private String codigoNaoEncontrado;
	
	public String getCodigoNaoEncontrado() {
		return codigoNaoEncontrado;
	}
	public CodigoNaoEncontradoException(String codigoNaoEncontrado) {
		super("Erro : Codigo nao encontrado");
		this.codigoNaoEncontrado = codigoNaoEncontrado;
	}


}
