public class TestePincel {

	public static void main(String[] args) {
		 /*int i;
        i = 10;
        
        
        double d;
        d = 3.14;

        boolean b = false;*/

        Pincel p1 = new Pincel("Vermelho","Cilindrico",10);
        // p1.cor = "Vermelho";
        //p1.forma = "Cilindrico";
        //p1.comprimento = 10;

        System.out.println(p1.cor);
        System.out.println(p1.forma);
        System.out.println(p1.comprimento);

        System.out.println();

        Pincel p2 = new Pincel("Verde","Sextavado",12);
        //p2.cor = "Verde";
        //p2.forma = "Sextavado";
        //p2.comprimento = 12;

        System.out.println(p2.cor);
        System.out.println(p2.forma);
        System.out.println(p2.comprimento);

        p2.riscar("UNI7");


	}

}