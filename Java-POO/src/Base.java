
public class Base extends Time {
	private String baseTime;
	private int mediaIdade;
	private String categoria;
	
	public Base(String nome, String estadio, int idade, int numJogadores, String baseTime) {
		super(nome, estadio, idade, numJogadores);
		this.baseTime = baseTime;
	}
	public Base(String nome, String estadio, int idade, int numJogadores, String baseTime, int mediaIdade) {
		super(nome, estadio, idade, numJogadores);
		this.mediaIdade = mediaIdade;
	}
	public Base(String nome, String estadio, int idade, int numJogadores, String baseTime, int mediaIdade, String categoria) {
		super(nome, estadio, idade, numJogadores);
		this.categoria = categoria;
	}
	public void exibir() {
		System.out.println("Base do time : "+baseTime);
		System.out.println("Media de idade : "+mediaIdade);
		System.out.println("Categoria : "+categoria);
	}
	public String getBaseTime() {
		return baseTime;
	}
	public void setBaseTime(String baseTime) {
		this.baseTime = baseTime;
	}
	public int getMediaIdade() {
		return mediaIdade;
	}
	public void setMediaIdade(int mediaIdade) {
		this.mediaIdade = mediaIdade;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
