

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		int k = 10;
		int[] numbers = { 2, 3, 4, 6, 7 }; // => {2, 3, 4, '5', 6, 7}

		// O(n)
		boolean achou = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == k) {
				System.out.println("K foi encontrado na posição: " + i);
				achou = true;
				break;
			}
		}

		if (!achou) {
			System.out.println("Chave não encontrada!");
		}

		// O(log n)
//		index = (-(insertion) - 1)
//		-(insertion) - 1 = index					
//		-(insertion) = index + 1
//		insertion = -index - 1
		int index = Arrays.binarySearch(numbers, k);
		if (index >= 0) {
			System.out.println("Busca binária achou a chave na posição: " + index);
		} else {
			int insertion = -index - 1;
			System.out.println("A chave buscada deveria estar na posição: " + insertion);
		}
	}
}
