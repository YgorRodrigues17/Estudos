package Excecoes;

public class IdadeInexistenteException extends Exception {
		private int idadeInexistente = 0;
		
		public int getIdadeInexistente() {
			return idadeInexistente;
		}
		public IdadeInexistenteException(int idadeInexistente) {
			super("Erro : idade inexistente");
			this.idadeInexistente = idadeInexistente;
		}

	}


