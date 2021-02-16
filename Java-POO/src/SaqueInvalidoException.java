
public class SaqueInvalidoException extends Exception{
	private double saqueInvalido = 0;
	
	public double getSaqueInvalido() {
		return saqueInvalido;
	}
	public SaqueInvalidoException(double saqueInvalido) {
		super("Erro : Tentativa de saque invalido");
		this.saqueInvalido = saqueInvalido;
	}
	
	
	

}
