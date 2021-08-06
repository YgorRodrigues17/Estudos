
public class TestePaisPresidente {

	public static void main(String[] args) {
		Pais p = new Pais("BRASIL","AMERICA");
		Presidente pre = new Presidente("JAIR BOLSONARO","2018");
		p.setPresidente(pre);
		p.mostrar();

	}

}
