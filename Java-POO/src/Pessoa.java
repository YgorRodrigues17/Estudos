
public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private int idade;
	private Veiculo veiculo;
	
	public Pessoa() {
		this.nome = " ";
	}
	public Pessoa(String nom, int id) {
		nome = nom;
		idade = id;
	}
	
	public Pessoa(String nom, String tel, int id) {
		nome = nom;
		telefone = tel;
		idade = id;
	}
	
	public void exibir() {
		System.out.println("nome : "+nome);
		System.out.println("endereco : "+endereco);
		System.out.println("telefone : "+telefone);
		System.out.println("idade : "+idade);
		if(veiculo != null)
			veiculo.imprimirDocumento();
		
	}
	public void setVeiculo(Veiculo vec) {
		veiculo = vec;
	}
   public Veiculo getVeiculo() {
	   return veiculo;
   }
}
