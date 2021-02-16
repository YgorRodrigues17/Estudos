
public class Remedio2 {
	private int codigo;
	private String nome;
	private int diaFabricacao;
	private int anoFabricacao;
	private int validade;
	private double preco;
	private Data2 d;
	
	public Remedio2 (int c, String n, int df, int af, int v, double p) {
		codigo = c;
		nome = n;
		diaFabricacao = df;
		anoFabricacao = af;
		validade = v;
		preco = p;
	}
	public void exibir() {
		System.out.println("Codigo : "+codigo);
		System.out.println("Nome : "+nome);
		System.out.println("Dia da fabricacao : "+diaFabricacao);
		System.out.println("Ano de fabricacao : "+anoFabricacao);
		System.out.println("Validade : "+validade);
		System.out.println("Preco : "+preco);
		if(d != null)
			d.mostrar();
			
	}
	public void setData2(Data2 da) {
		d = da;
	}
	public Data2 getData2() {
		return d;
	}
	

}
