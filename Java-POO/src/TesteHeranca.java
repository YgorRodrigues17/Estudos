
public class TesteHeranca {

	public static void main(String[] args) {
		EstudanteMonitor em = new EstudanteMonitor(111,"joao",'M',500.00,"POO");
		
		System.out.println("*****Aluno monitor*****");
		em.exibir();
		em.atribuirNota(1, 7.0);
		em.atribuirNota(2, 8.0);
		double nota = em.lerNota(2);
		System.out.print("A nota é " + nota);
		em.exibir();
		
		em.tirarDuvidas();
		em.auxiliarProfessor();
		
		EstudanteEstagiario ee = new EstudanteEstagiario(222,"Paulo",'M',900.00,"Microsoft");
		System.out.println("*****Aluno estagiando*****");
		ee.exibir();
		ee.trabalhar();

	}

}
