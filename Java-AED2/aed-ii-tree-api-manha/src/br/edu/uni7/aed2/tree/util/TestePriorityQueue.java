package br.edu.uni7.aed2.tree.util;

import br.edu.uni7.aed2.tree.BinHeap;

public class TestePriorityQueue {
	public static void main(String[] args) {
		BinHeap queue = new BinHeap();

		// P: 1 .. 40
		// NP: 41 .. 80

		Integer[] l1 = { 20, 5, 12, 2, 9, 3, 1 };
		Integer[] l2 = { 42, 50, 52, 64, 75, 43, 41 };

		for (int i = 0; i < l2.length; i++) {
			int p = l1[i];
			int np = l2[i];

			System.out.println("P: " + p);
			System.out.println("NP: " + np);

			queue.insert(p);
			queue.insert(np);
		}

		System.out.println();

		while (!queue.isEmpty()) {
			Integer element = queue.delMin();
			System.out.println("Chamando " + element + " para atendimento.");
		}
	}
}
