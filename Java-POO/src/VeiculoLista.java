
public class VeiculoLista {

	private String placa;
	private String marca;
	public VeiculoLista ( String pl, String mar ) { 
		placa = pl;
		marca = mar;
	}

	public void setPlaca ( String pl ) { placa = pl; }
	
	public String getPlaca () { 
		return placa; }
	
	public void setMarca ( String mar ) { marca = mar; }
	
	public String getMarca () { 
		return marca; }
	
	public void visualizar () {
		System.out.println("placa = " + placa);
		System.out.println("marca = " + marca);
	}
}


