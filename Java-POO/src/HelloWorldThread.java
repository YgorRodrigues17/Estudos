
public class HelloWorldThread extends Thread {
	public void run() {
		while(true) {
			System.out.println("Dentro da thread run");
		}
	}

	public static void main(String[] args) {
		HelloWorldThread t = new HelloWorldThread();
		HelloWorldThread t2 = new HelloWorldThread();
		t.start(); //O START é a ativação do método RUN
		t2.start();
		while(true) {
			System.out.println("Dentro da thread main");
		}
	}

}
