
public abstract class Aparelho {
	
	public Aparelho() {}
	
	abstract void ligar();
	abstract void desligar();
	
	public void exibir() {
		System.out.println("Exibindo o aparelho...");
	}
}
