
public class TesteAparelho {

	public static void main(String[] args) {
		Aparelho ap1 = new Televisao();
		Aparelho ap2 = new Microondas();
		
		Televisao tv2 =  new Televisao();
		tv2.exibir();
		
		testarAparelho(ap1);
		testarAparelho(ap2);

	}
	public static void testarAparelho(Aparelho aparelho) {
		System.out.println("*********************");
		aparelho.ligar();
		aparelho.desligar();
		aparelho.exibir();
	}

}
