import java.util.ArrayList;

public class TesteArrayListInicial {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Topicos");
		a1.add(10);
		a1.add(new Estudante("Maria",'F'));
		print(a1);
		
		Estudante e = (Estudante) a1.get(2);
		e.exibir();
		
		a1.remove(0);
		print(a1);
		
		a1.add(1,"UNI7");
		print(a1);
		
		a1.set(1, "A melhor do estado");
		print(a1);
		System.out.println("A lista esta vazia?"+ a1.isEmpty());
		System.out.println("A lista esta vazia?"+a1.contains("A melhor do estado"));

	}
	public static void print(ArrayList a) {
		System.out.println("Exibindo a lista*********************");
		for (int i = 0; i < a.size(); i++) 
		{
			System.out.println(a.get(i));
	
		}
	}

}
