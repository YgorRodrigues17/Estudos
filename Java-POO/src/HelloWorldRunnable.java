
public class HelloWorldRunnable implements Runnable {
	public void run() {
		while(true) {
			System.out.println("Hello world of threads");
		}
	}

	public static void main(String[] args) {
		HelloWorldRunnable runner = new HelloWorldRunnable();
		Thread t = new Thread(runner);
		t.start();
		while(true) {
			System.out.println("Thread 1");
		}
	}
}



