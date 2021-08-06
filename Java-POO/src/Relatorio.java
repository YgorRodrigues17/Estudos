
public class Relatorio {
	
	private String titulo;
	
	public Relatorio(String titulo) {
		this.titulo = titulo;
	}
	
	public void imprimir(Exibivel exibivel) {
		System.out.println(titulo);
		exibivel.exibir("Iprimindo relatorio...");
	}

}
