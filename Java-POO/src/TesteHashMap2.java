import java.util.HashMap;

public class TesteHashMap2 {

	public static void main(String[] args) {
		
		HashMap<Integer,Estudante> hm = new HashMap<Integer,Estudante>();
		hm.put(1, new Estudante("Maria",'F',111));
		hm.put(2, new Estudante ("Jose",'M',222));
		hm.put(3, new Estudante("Camila",'F',333));
		
		//buscando elemento
		hm.get(1).exibir();
	    hm.get(2).exibir();
	    hm.get(3).exibir();
		

	}

}