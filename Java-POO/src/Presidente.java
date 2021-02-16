// sinal de '+' significa 'private'
// sinal de '-' significa 'public'
public class Presidente {
	private String nome;
	private String dataPosse;
	private Pais pais;

	public Presidente(String p,String dp) {
		nome = p;
		dataPosse = dp;
	}	
	public void exibir() {
		System.out.println("nome : "+nome);
		System.out.println("data da posse : "+dataPosse);
	}
	public void setPais(Pais p) {
		pais = p;
	}
	public Pais getPais() {
		return pais;
	}

}


