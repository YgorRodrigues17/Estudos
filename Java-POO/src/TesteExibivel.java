
public class TesteExibivel {

	public static void main(String[] args) {
		
	Parafuso p = new Parafuso(111,"Parafuso grosso","Bosch",2,0.25);
	Rosca r = new Rosca(222,"Rosca de latao","Philco",0.5,3);
	
	Equipamento e = new Equipamento("Furadeira");
	e.adicionar(p);
	e.adicionar(r);
	
	Relatorio re = new Relatorio("Relatorio de pecas");
	re.imprimir(e);
	

	}

}
