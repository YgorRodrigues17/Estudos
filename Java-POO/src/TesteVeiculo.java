
public class TesteVeiculo {

	public static void main(String[] args) {
		CarroPasseio cp = new CarroPasseio("HYL - 6053","CTXHYAK749HY",2008,"MITSUBISHI","Pajero TR4","Preto");
		Caminhao ca =  new Caminhao("HUZ - 5757","JDHE7394DBD74DH",2017,"VOLVO",4);
		
	    Frota2 f = new Frota2();
	    
	    try {
	    	f.incluir(null);
	    	f.consultar("HWR - 7765");
	    	f.excluirVeiculo("Veiculo 4");
	    	f.aumentarPrecoPlaca("HYL - 6053", -300);
	    }
	    catch(VeiculoNuloException e) {
	    	System.out.println(e.getMessage());
	    	System.out.println("veiculo que deu erro : "+e.getveiculoNulo());
	    }
	    catch(PlacaNaoLocalizadaException e) {
	    	System.out.println(e.getMessage());
	    	System.out.println("Placa que deu erro : "+e.getplacaNaoLocalizada());
	    }
	    catch(VeiculoNaoLocizadoException e) {
	    	System.out.println(e.getMessage());
	    	System.out.println("Veiculo que deu erro : "+e.getveiculoNaoLocalizado());
	    }
	    catch(AumentoNegativoException e) {
	    	System.out.println(e.getMessage());
	    	System.out.println("Aumento que deu erro : "+e.getaumentoNegativo());
	    }
	    catch(Exception e) {
	    	System.out.println(e.getMessage());
	    	e.printStackTrace();
	    }
	    finally {
	    	System.out.println("Smpre vai passar por aqui");
	    }
		
			

}
}