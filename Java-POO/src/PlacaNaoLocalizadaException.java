
public class PlacaNaoLocalizadaException extends Exception{
	private String placaNaoLocalizada = ".";
	
	public String getplacaNaoLocalizada() {
		return placaNaoLocalizada;
	}
	public PlacaNaoLocalizadaException(String placaNaoLocalizada) {
		super("Erro : tentariva de placa nao localizada");
		this.placaNaoLocalizada = placaNaoLocalizada;
	}

}
