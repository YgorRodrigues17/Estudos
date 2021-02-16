
public class Disciplina {
	private String nome;
	private String codigo;
	private int cargaHoraria;
	
	Estudante [] estudante = new Estudante [5];
	
	public Disciplina(String nom, String cod, int ch){
		nome = nom;
		cod = codigo;
		cargaHoraria = ch;
	}
	
	public void incluirEstudante(Estudante e) {
		
	}
	
    public void listarEstudantes() {
        System.out.println("nome : "+nome);
        System.out.println("codigo : "+codigo);
    	System.out.println("carga horaria : "+cargaHoraria);
    	
    }

}
