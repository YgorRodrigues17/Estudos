public class Pincel {
	 String cor;
	  String forma;
	  int comprimento;

	  public Pincel(){}

	  public Pincel(String c, String f, int comp){
	      this.cor = c;
	      this.forma = f;
	      this.comprimento = comp;
	  }

	  public void riscar(String palavra){
	      System.out.println("Riscando da cor:"+cor+":"+palavra);
	  }
	 

}