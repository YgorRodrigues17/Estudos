
public abstract class Peca implements Exibivel{
	private int codigo;
	private String descricao;
	private String marca;
	
	public static int numPecas = 0;
	
	public static int getNumPecas() {
		return numPecas;
	}
	public Peca() {
		numPecas++;
	}
	public Peca(int codigo, String descricao, String marca) {
		this();
		this.codigo = codigo;
		this.descricao = descricao;
		this.marca = marca;
	}
	
	public void exibir() {
		System.out.println("Codigo : " +codigo);
		System.out.println("Descricao : "+descricao);
		System.out.println("Marca : "+marca);
		
	}
	
	public void exibir(String texto) {
		System.out.println(texto);
		this.exibir();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void imprimir() {}
	
	public void setMarca(Marca m2) {
		
		
	}
	
	
}
