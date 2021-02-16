public class TesteEstudante{
	public static void main(String[] args) {
		
		
		Estudante est = new Estudante("Hanyelle",'F',123);
		try {
			
		    est.atribuirNota(1, 5.0);
			est.atribuirNota(2);
			est.atribuirNota(5, 10);
			est.atribuirNota(4, 8.0);			
		}
		catch(NotaInvalidaException e) {
			System.out.println(e.getMessage());
			System.out.println("Nota que deu erro : "+ e.getNotaInvalida());
		}
		catch(ProvaInvalidaException e) {
			System.out.println(e.getMessage());
			System.out.println("Prova que deu erro :"+ e.getProvaInexistente());
			System.out.println("Pilha de execucao na hora do erro");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Erro : " +e.getMessage());
			System.out.println("Pilha de execucao na hora do erro");
			e.printStackTrace();
		}
		finally {
			System.out.println("Vai sempre passar por aqui");
		}
		
		est.exibir();
		
		
		/*Estudante e = new Estudante();
		e.matricula = 123;
		e.nome = "ygor";
		e.sexo = 'm';
		
		//e.notas[0] = 8.0;
		e.atribuirNota(1, 8.0);
		
		//e.notas[1] = 10.0;
		e.atribuirNota(2, 10.0);
		
		//e.notas[2] = 9.0;
		e.atribuirNota(3, 9.0);
		
		//e.notas[3] = 7.0;
		e.atribuirNota(4, 7.0);
		
		e.exibir("dados do estudante");
		
		double nota1 = e.lerNota(1);
		System.out.println("nota 1 : "+ nota1);
		System.out.println("nota 1 : "+ e.lerNota(1));
		
		Estudante e2 = new Estudante("Camila", 'F');
		e2.exibir("segundo estudando");
		
		Estudante e3 = new Estudante("Mairton", 'M',222);
		e3.exibir("terceiro estudante");
		
		Curso curso = new Curso("Sistemas de informacao","GSI",3160);
		//curso.exibir();
		e.setMeuCurso(curso);
		e.exibir();
		*/
	}
}