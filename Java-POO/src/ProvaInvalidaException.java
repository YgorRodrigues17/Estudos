
public class ProvaInvalidaException extends Exception {
	private int provaInexistente = 0;
	
	public int getProvaInexistente() {
		return provaInexistente;
	}
	public ProvaInvalidaException() {
		System.out.println("Erro : Tentativa de lancar nota numa prova invalida");
	}
	public ProvaInvalidaException(int provaInexistente) {
		this();
		this.provaInexistente = provaInexistente;
	}
	

}
