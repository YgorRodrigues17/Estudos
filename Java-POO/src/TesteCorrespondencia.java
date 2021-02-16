
public class TesteCorrespondencia {

	public static void main(String[] args) {
		Correspondencia c1 = new Correspondencia(120,1.5,"16/07/2020");
		Correspondencia c2 = new Correspondencia(230,2.5,"06/08/2020");
		
		CorrespondenciaAR ca1 = new CorrespondenciaAR(250,5.0,"08/09/2020");
		CorrespondenciaAR ca2 = new CorrespondenciaAR(350,6.0,"12/10/2020");
		
		Malote m = new Malote("Brasilia","18/10/2020");
		m.adicionar(c1);
		m.adicionar(c2);
		m.adicionar(ca1);
		m.adicionar(ca2);
		
		m.conferirPrecos(1.5);
		m.conferirPrecos(2.5);
		
		m.remover(2.5);
		
		m.remeter();
		
		
		
		

	}

}
