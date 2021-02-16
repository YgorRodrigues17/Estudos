import java.util.*;

public class TesteArrayListInicial2 {

	public static void main(String[] args) {
		ArrayList<Estudante> a1 = new ArrayList<Estudante>();

		Estudante e1 = new Estudante("Camila",'F',111);
		Estudante e2 = new Estudante("Ygor",'M',222);
		Estudante e3 = new Estudante("Pablo",'M',333);
		Estudante e4 = new Estudante("Darison",'M',444);
		Estudante e5 = new Estudante("Davi",'M',555);
		Estudante e6 = new Estudante("Eneas",'M',666);
		Estudante e7 = new Estudante("Gabriel",'M',777);
		/*estudantes.add(e1);
		estudantes.add(e2);
		estudantes.add(e3);
		estudantes.add(e4);
		estudantes.add(e5);
		estudantes.add(e6);
		estudantes.add(e7);

		printIterator(estudantes);*/

	}

	public  static void printIterator(ArrayList<Estudante> lista) {
		ListIterator<Estudante> it = lista.listIterator();
		System.out.println("exibindo a lista usando iterator************");
		while(it.hasNext()) {
			it.next().exibir();
		}

		while(it.hasPrevious()) {
			it.previous().exibir();
		}
	}


	public  static void printForEach(ArrayList<Estudante> lista) {
		System.out.println("exibindo a lista************");
		for(Estudante e : lista) {
			e.exibir();
		}
	}
	/*
	public static void printFor(ArrayList<Estudante> lista) {
		System.out.println("exibindo a lista********");
		for(int i = 0; i < lista.size(); i++) {
			lista.get(i).exibir();
		}
	}
	 */
}
