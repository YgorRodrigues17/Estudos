public class Recursividade {
	public int fatorial(int n) {
		int result = 1;

		if (n == 0) {
			result = 1;
		} else {
			result = 1 * fatorial(n - 1);
		}

		return result;
	}
}
