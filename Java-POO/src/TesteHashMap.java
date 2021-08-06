import java.util.HashMap;

public class TesteHashMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Maria");
		hm.put("Jose", new Estudante ("Jose",'M',111));
		System.out.println(hm.get(1));
		System.out.println(hm.get("Jose"));
		Estudante e = (Estudante) hm.get("Jose");
		e.exibir();
		

	}

}
