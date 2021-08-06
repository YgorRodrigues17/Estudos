
public class TesteTurma {

	public static void main(String[] args) {
		      Estudante e = new Estudante("Maria", 'F', 111);
		      
		      Turma topicos = new Turma("Tópicos");

		      System.out.println();
		      System.out.println("matriculando estudante...");
		      topicos.matricular( e );

		      System.out.println();
		      System.out.println("matriculando estudante monitor...");
		      e = new Estudante("Joana", 'F', 222);
		      topicos.matricular( e );

		      //System.out.println("--------------------------");
		      System.out.println();
		      System.out.println("matriculando estudante...");
		      e = new Estudante("Carlos", 'M', 333);
		      topicos.matricular( e );
		      
		      System.out.println();
		      System.out.println("listando relacao de estudantes...");
		      topicos.listar();
		      
		      topicos.pesquisar( 444 );

		      Estudante e2 = topicos.pesquisar( 222 );
		      
		      System.out.println();
		      System.out.println("exibindo estudante pesquisado...");
		      e2.exibir();
		      
		      System.out.println();
		      System.out.println("estudantes matriculados -> " + topicos.getNumEstudantes() );

		   }
		

	}


