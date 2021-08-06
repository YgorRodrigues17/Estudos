package Negocio;
import java.util.ArrayList;
import java.util.ListIterator;

import Excecoes.CodigoNaoEncontradoException;
import Excecoes.IdadeInexistenteException;

public class CompanhiaAerea{
	private String nome;
	private long cnpj;
	ArrayList<Aeronave> lista = new ArrayList<Aeronave>();
	
	public CompanhiaAerea(String nome, long cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public void adquirir(Aeronave aeronave) {
		lista.add(aeronave);
	}
	public void vender(Aeronave aeronave) {
		lista.remove(aeronave);
	}
	public void  liberarAterrissagem(String codigo) throws CodigoNaoEncontradoException{
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getCodigo().equals(codigo))
				lista.get(i).aterrisar();
			return;
		}
        throw new CodigoNaoEncontradoException(codigo);
}


	public void revisar(int idade) throws IdadeInexistenteException{
		boolean achou = false;
		ListIterator<Aeronave> it = lista.listIterator();
		Aeronave a = null;
		while(it.hasNext()) {
			it.next().exibir();
		if(a.getIdade() < idade) {
			a.fazerRevisao();
			achou = true;
		}
		}
			throw new IdadeInexistenteException(idade);
	}
}



