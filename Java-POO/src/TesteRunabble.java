
public class TesteRunabble implements Runnable {
	public void run() {
		while(true) {
			System.out.println("Teste of threads");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		TesteRunabble runner =  new TesteRunabble();
		Thread t = new Thread(runner);
		
		t.start();
		while(true) {
			System.out.println("Thread 1");
		}
		
		
		
		
	}

}
