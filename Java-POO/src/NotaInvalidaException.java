
public class NotaInvalidaException extends Exception {
	private double notaInvalida = 0;
	
	public double getNotaInvalida() {
		return notaInvalida;
	}
	
	public NotaInvalidaException(double notaInvalida) {
		super("Erro : Tentativa de lancar nota invalida");
		this.notaInvalida = notaInvalida;
	}
	

}
