
public class VfThread extends Thread {
	public void run() {
		int n = 1;
		while(true) {
			String nome = null;
			System.out.println("Thread" +nome+"=>"+(n * 5));
			n += 1;
		}
	}

	public static void main(String[] args) throws InterruptedException{
		VfThread vt1 = new VfThread();
		
		vt1.start();
		double n = 3;
		for(int i = 0; i < 50; i++) {
			n = 3 * n - 4;
			System.out.println("Thread 0 =>"+n);
			if(n % 2 != 0);
			vt1.sleep(100);

	}

}
}
