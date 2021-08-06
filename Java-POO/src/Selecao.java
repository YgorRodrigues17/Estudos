
public class Selecao extends Time {
	private String continente;
	private String regiao;
	
	public Selecao(String nome, String estadio, int idade, int numJogadores, String continente) {
		super(nome, estadio, idade, numJogadores);
		this.continente = continente;
	}
	public Selecao(String nome, String estadio, int idade, int numJogadores, String continente, String regiao) {
		super(nome, estadio, idade, numJogadores);
		this.regiao = regiao;
	}
	public void exibir() {
		System.out.println("Continente : "+continente);
		System.out.println("Regiao : "+regiao);
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	

}
