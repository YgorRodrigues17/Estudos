
public class TesteTurma4 {
	
	public static void main(String[] args) {
	Estudante e1 = new Estudante();
	EstudanteEstagiario4 ee = new EstudanteEstagiario4("1919099","Ygor Jose OLiveira Rodrigues","004.469.003-70",19,"Fortes Tecnologia",2200);
	EstudanteEstagiario4 ee2 = new EstudanteEstagiario4("1919150","Eneas Santos Gurgel","649.143.860-12",20,"Fortes Tecnologia",2200);
	EstudanteMonitor4 em = new EstudanteMonitor4("1919100","Davi Ferreira","958.356.109-54",20,"Programacao orientada a objetos",100);
	
	System.out.println("O numero de objetos criados e : "+Estudante.getNumEstudantes());
	System.out.println("Essa classe estudante e : "+Estudante.descricao);
	
	e1.exibir();
	
	Turma4 t = new Turma4();
	t.incluir(ee);
	t.incluir(ee2);
	t.incluir(em);
	t.listar();
	
	System.out.println("*****Consultando aluno*****");
	Estudante4 e = t.consultar("1919099");
	e.visualizar();
	
	System.out.println("*****Removendo aluno*****");
	t.excluir("95835610954");
	t.listar();
	

	
	
	

}
}