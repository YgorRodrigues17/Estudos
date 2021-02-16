
public class TesteRemedio2 {

	public static void main(String[] args) {
		Remedio2 r = new Remedio2(18564,"Dipirona",27,2020,2022,25.90);
		Data2 d = new Data2(30,9,2027);
		
		r.setData2(d);
		r.exibir();

	}

}
