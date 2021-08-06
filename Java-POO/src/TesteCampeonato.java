
public class TesteCampeonato {

	public static void main(String[] args) {
		Selecao s1 = new Selecao("Brasil","Maracana",106,32,"America","Sul");
		Selecao s2 = new Selecao("Espanha","Santiago Bernabeu",100,32,"Oeste");
		Base b1 = new Base("Ceara","Castelao",106,22,"Ceara",24,"SUB - 23");
		Base b2 = new Base("Fortaleza","Castelao",102,22,"Fortaleza",22,"SUB - 23");
		
		System.out.println("*****Selecoes internacionais******");
		Campeonato c1 = new Campeonato();
		c1.classificar(s1);
		c1.classificar(s2);
		c1.listar();
		
		System.out.println("*****Campeonato da base*****");
		Campeonato c2 = new Campeonato();
		c2.classificar(b1);
		c2.classificar(b2);
		c2.listar();
		
		System.out.println("*****Consultando time*****");
		Time t = c2.consultar("Ceara");
		t.visualizar();
		
		System.out.println("*****Eliminando time******");
		c1.eliminar("Brasil");
		c1.listar();

	}

}
