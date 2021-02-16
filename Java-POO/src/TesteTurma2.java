
public class TesteTurma2 {

	public static void main(String[] args) {
		Turma2 t1 =  new Turma2("Programação orientada a objetos",15);
		
		System.out.println("Matriculando estudante");
		Estudante e1 = new Estudante("Ygor Jose Oliveira Rodrigues",'M',1919099);
		e1.exibir();
		
		System.out.println("Matriculando estudante monitor");
		Estudante e2 = new Estudante("Davi Ferreira Ramires Trajano",'M',1919150);
		e1.exibir();
		
		System.out.println("Matriculando estudante estagiario");
		Estudante e3 = new Estudante("Pablo Andres Malpartida",'M',1919100);
		e3.exibir();
		
		t1.Pesquisar(1919099);
		t1.listar();
		
		
		
	}

}
		
		
