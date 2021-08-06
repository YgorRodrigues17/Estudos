import java.util.HashMap;
public class TesteHashMap3 {

	public static void main(String[] args) {
		HashMap<Integer,Estudante> hm = new HashMap<Integer,Estudante>();
		hm.put(1, new Estudante("Ygor Jose Oliveira Rodrigues",'M',1919099));
		hm.put(2, new Estudante("Davi Ferreira Ramires Trajano",'M',1919100));
		hm.put(3, new Estudante("Pablo Andres Malpartida",'M',1919150));
		
	    hm.get(1).exibir();
	    hm.get(2).exibir();
	    hm.get(3).exibir();
		

	

	}

}
