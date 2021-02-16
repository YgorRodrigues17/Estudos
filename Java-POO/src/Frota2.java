import java.util.ArrayList;
import java.util.ListIterator;
public class Frota2 {
		ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
			
		public void incluir(String veiculo)throws VeiculoNuloException {
			if(veiculo == null)
				throw new VeiculoNuloException(veiculo);
		}
		public void excluir(Veiculo veiculo) {
			lista.remove(veiculo);
		}
		public void listar() {
			ListIterator<Veiculo> it = lista.listIterator();
	        while(it.hasNext())
	        	it.next().visualizar();
	     }
		public void excluirPlaca(String placa) {
			for(int i = 0; i < lista.size(); i++)
				if(lista.get(i).getPlaca().equals(placa))
					lista.remove(i);
		}
		public void excluirChassi(long chassi) throws ChassiNaoLocalizadoException {
			if(chassi == 0)
				throw new ChassiNaoLocalizadoException(chassi);
		}
		public void excluirVeiculo(String veiculo) throws VeiculoNaoLocizadoException {
			if(veiculo != null)
				throw new VeiculoNaoLocizadoException(veiculo);
		}
		
		public void consultar(String placa) throws PlacaNaoLocalizadaException{
			if(placa != null)
				throw new PlacaNaoLocalizadaException(placa);
		}
		public void consultar(long chassi) throws ChassiNaoLocalizadoException{
			if(chassi != 0)
				throw new ChassiNaoLocalizadoException(chassi);
		}
		public Veiculo aumentarPreco(long chassi, double preco) {
			for(Veiculo v : lista)
				if(v.getChassi().equals(chassi))
					return v;
			return  null;
		}
		public void aumentarPrecoPlaca(String placa, double preco) throws AumentoNegativoException {
			if(preco < 0.0)
				throw new AumentoNegativoException(preco);
		}
		public Veiculo diminuirPreco(String placa, double preco) {
			for(Veiculo v : lista)
				if(v.getPlaca().equals(placa))
					return v;
			return  null;
}
		public Veiculo diminuirPreco(long chassi, double preco) {
			for(Veiculo v : lista)
				if(v.getChassi().equals(chassi))
					return v;
			return  null;
}
}


