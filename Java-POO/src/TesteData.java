
public class TesteData {
	public static void main(String args[])
	{
		Data hoje = new Data();
		/*
		hoje.dia = 13;
		hoje.mes = 8;
		hoje.ano = 2020;
		 */
		hoje.setDia(25);
		hoje.setMes(8);
		hoje.setAno(2020);

		int meuDia = hoje.getDia();
		System.out.println("o dia e "+meuDia);
        System.out.println("mostrando de novo o dia  "+hoje.getDia());

		int meuMes = hoje.getMes();
		System.out.println("o mes e "+meuMes);
        System.out.println("mostrando de novo o mes  "+hoje.getMes());

		int meuAno = hoje.getAno();
		System.out.println("o ano e "+meuAno);
		System.out.println("mostrando de novo o ano  "+hoje.getAno());





		hoje.exibir("hoje criado sem invocando o construtor default");



		System.out.println();



		hoje.incrementarAno();
		hoje.exibir();

		hoje.incrementarAno(2);
		hoje.exibir("depois de incrementar ano com parametro");


		Data nova = new Data(18, 8, 2020);
		nova.exibir("nova data");
		Data amanha = new Data(19, 8, 2020);
		amanha.exibir("amanha");

		Data outra = new Data(2000);
		outra.exibir("criando somente com o ano");;

	}
}
