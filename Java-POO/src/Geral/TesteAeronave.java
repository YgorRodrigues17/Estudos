package Geral;

import Negocio.Aeronave;

import Excecoes.CodigoNaoEncontradoException;
import Negocio.CompanhiaAerea;
import Excecoes.IdadeInexistenteException;

public class TesteAeronave {

	public static void main(String[] args) throws CodigoNaoEncontradoException, IdadeInexistenteException {
		  CompanhiaAerea c = new CompanhiaAerea ("VoeMais", 123456);
	         c.adquirir (new Aeronave("pt500", "carga", 5));
	         c.adquirir( new Aeronave("pt501", "passageiro", 3));
	         c.liberarAterrissagem("pt555");
	         c.revisar(2);
		
		try {
			c.revisar(5);
			c.liberarAterrissagem("pt500");
			
		}
		catch(IdadeInexistenteException e) {
			System.out.println(e.getMessage());
			System.out.println("Idade que deu erro : "+e.getIdadeInexistente());
		}
		catch(CodigoNaoEncontradoException e) {
			System.out.println(e.getMessage());
			System.out.println("Codigo que deu erro : "+e.getCodigoNaoEncontrado());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("FINAL DO PROGRAMA");
		}
		

	}

}
