
public class AumentoNegativoException extends Exception{
	private double aumentoNegativo = 0;
	
	public double getaumentoNegativo() {
		return aumentoNegativo;
	}
	public AumentoNegativoException(double aumentoNegativo) {
		super("Erro : tentativa de aumento negativo");
		this.aumentoNegativo = aumentoNegativo;
	}

}
