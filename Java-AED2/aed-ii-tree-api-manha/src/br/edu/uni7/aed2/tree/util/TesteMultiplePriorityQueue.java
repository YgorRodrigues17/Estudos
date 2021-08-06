package br.edu.uni7.aed2.tree.util;

import br.edu.uni7.aed2.tree.BinHeap;

public class TesteMultiplePriorityQueue {
	public static void main(String[] args) {
		BinHeap q1 = new BinHeap();
		BinHeap q2 = new BinHeap();

		Integer[] l1 = { 20, 5, 12, 2, 9, 3, 1 };
		Integer[] l2 = { 42, 50, 52, 64, 75, 43, 41 };

		for (int i = 0; i < l2.length; i++) {
			int p = l1[i];
			int np = l2[i];

			System.out.println("P: " + p);
			System.out.println("NP: " + np);

			q1.insert(p);
			q2.insert(np);
		}
		
		System.out.println();
		
		int i = 0;
		int j = 0;
		while (!q1.isEmpty() || !q2.isEmpty()) {
			while (i < 3) {
				if (!q1.isEmpty()) {
					Integer element = q1.delMin();
					System.out.println("Chamando " + element + " da fila Prioritária.");
					
					i++;
				} else {
					System.out.println("Fila Prioritária Vazia.");
					break;
				}
			}
			i = 0;
			
			while (j < 2) {
				if (!q2.isEmpty()) {
					Integer element = q2.delMin();
					System.out.println("Chamando " + element + " da fila Não Prioritária.");
					
					j++;
				} else {
					System.out.println("Fila Não Prioritária Vazia.");
					break;
				}
			}
			j = 0;
			
			System.out.println();
		}
	}
}