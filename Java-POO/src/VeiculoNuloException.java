
public class VeiculoNuloException extends Exception{
private String veiculoNulo = ".";
	
	public String getveiculoNulo() {
		return veiculoNulo;
	}
	public VeiculoNuloException(String veiculoNulo) {
		super("Erro : tentativa de veiculo nao localizado");
		this.veiculoNulo = veiculoNulo;
	}

}
