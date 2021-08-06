
public class TesteFestival {

	public static void main(String[] args) {
		BandaRock br1 = new BandaRock("Iron Maiden","Rock",6,"Heavy Metal",45);
		BandaRock br2 = new BandaRock("Metallica","Rock",4,"Heavy Metal",39);
		BandaReggae bre = new BandaReggae("Soja","Reggae",8,"Roots Reggae",23);
		
		Festival f = new Festival();
		f.incluir(br1);
		f.incluir(br2);
		f.incluir(bre);
		f.listar();
		
		System.out.println("*****Contultando banda*****");
		Banda b = f.pesquisar("Metallica");
		b.visualizar();
		
		System.out.println("*****Removendo banda*****");
		f.excluir("Soja");
		f.listar();

	}

}
