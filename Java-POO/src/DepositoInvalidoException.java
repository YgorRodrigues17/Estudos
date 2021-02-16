
public class DepositoInvalidoException extends Exception {
	private double depositoInvalido = 0;
	
	public double getDepositoInvalido() {
		return depositoInvalido;
	}
	public DepositoInvalidoException(double depositoInvalido) {
		super("Erro :  Tentativa de deposito invalido");
		this.depositoInvalido = depositoInvalido;
	}
	

}
