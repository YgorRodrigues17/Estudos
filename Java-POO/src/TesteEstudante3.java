
public class TesteEstudante3 {

	public static void main(String[] args) {

		Estudante3 e = new Estudante3();
		
		e.setMatricula(1919099);
		e.setNome("ygor");
		e.setSexo('M');

		int minhaMatricula = e.getMatricula();
		System.out.println("minha matricula : "+minhaMatricula);
     
		String meuNome = e.getNome();
		System.out.println("o meu nome e : "+meuNome);
        
        char meuSexo = e.getSexo();
		System.out.println("o sexo e : "+meuSexo);
		



		//e.notas[0] = 8.0;
		e.atribuirNota(1, 9.5);

		//e.notas[1] = 10.0;
		e.atribuirNota(2, 8.0);

		//e.notas[2] = 9.0;
		e.atribuirNota(3, 10.0);

		//e.notas[3] = 7.0;
		e.atribuirNota(4, 8.5);

		e.exibir("dados do estudante");

		double nota1 = e.lerNota(1);
		System.out.println("nota 1 : "+ e.lerNota(1));

		Estudante e2 = new Estudante("Jose", 'M');
		e2.exibir("segundo estudante");
		

		Estudante e3 = new Estudante("Mairton", 'M',222);
		e3.exibir("terceiro estudante");

	}
}


