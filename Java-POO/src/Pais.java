// sinal de '+' significa 'private'
// sinal de '-' significa 'public'
public class Pais {
	private String nome;
	private String continente;
	private Presidente chefe;

	public Pais(String n,String con) {
		nome = n;
		continente = con;
	}

	public void mostrar() {
		System.out.println("nome : "+nome);
		System.out.println("continente : "+continente);
		if(chefe != null)
		    chefe.exibir();

	}
	public void setPresidente(Presidente che) {
		chefe = che;
	}
	public Presidente getPresidente() {
		return chefe;
	}

}
