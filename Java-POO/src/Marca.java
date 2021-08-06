
public class Marca {
	private int codigo;
	private String nome;

	
	public Marca() {
		codigo = 0;
		nome = null;
	}
	
	public Marca(int c,String n) {
		codigo = c;
		nome = n;
	}
	public void mostrar() {
		System.out.println("Codigo :"+codigo);
		System.out.println("Nome : "+nome);
	}
	public void mostrar(String texto) {
		System.out.println("Mostrando de novo os atributos de marca");
		mostrar();
	}

}
