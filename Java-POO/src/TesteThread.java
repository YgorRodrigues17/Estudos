
public class TesteThread extends Thread {
	public void run() {
		while(true) {
			System.out.println("Dentro do metodo run");
		}
	}
	
	

	public static void main(String[] args) {
		TesteThread t1 = new TesteThread();
		TesteThread t2 = new TesteThread();
		
		t1.start();
		t2.start();
		while(true) {
			System.out.println("Dentro do metodo main");
		}
		
		
	}

}
