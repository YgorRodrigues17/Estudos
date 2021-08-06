
public class Pessoa2 {
	private Carro2 carros [] = new Carro2[5];
	private int numCarros = 0;
	
	private String nome;

	
	public Pessoa2() {
		nome = "";
	}
	public Pessoa2(String nom) {
		nome = nom;
	}
	public void setNome(String nom) {
		nome = nom;
	}
	public String getNome() {
		return nome;
	}
}
