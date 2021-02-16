
public class VeiculoNaoLocizadoException extends Exception{
	private String veiculoNaoLocalizado = ".";
	
	public String getveiculoNaoLocalizado() {
		return veiculoNaoLocalizado;
	}
	public VeiculoNaoLocizadoException(String veiculoNaoLocalizado) {
		super("Erro : tentativa de veiculo nao localizado");
		this.veiculoNaoLocalizado = veiculoNaoLocalizado;
	}

}
