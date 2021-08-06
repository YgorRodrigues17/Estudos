
public class Curso {
	private String nome;
	private String codigo;
	private int cargaHoraria;

	public Curso(String nom, String cod, int ch) {
		nome = nom;
		codigo = cod;
		cargaHoraria = ch;
    }
	public void processar(Curso e) {
		
	}
	public void testar() {
		processar(this);
	}

	public void setNome(String nom) {
		nome = nom;
	}
	public void setCodigo(String cod) {
		codigo = cod;
	}
	public void setcargaHoraria(int ch) {
		cargaHoraria = ch;
	}
	public String getNome() {
		return nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getcargaHoraria() {
		return cargaHoraria;
	}
	public void exibir() {
		System.out.println("****Dados do curso****");
		System.out.println("nome : "+nome);
		System.out.println("codigo : "+codigo);
		System.out.println("carga horaria : "+cargaHoraria);
	}
}
