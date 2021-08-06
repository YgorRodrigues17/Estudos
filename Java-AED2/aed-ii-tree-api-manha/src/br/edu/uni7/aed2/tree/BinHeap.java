package br.edu.uni7.aed2.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinHeap {
	private static final int FIRST = 1;
	private List<Integer> heapList;
	private int currentSize;

	public BinHeap() {
		this.heapList = new ArrayList<Integer>();
		this.heapList.add(0);

		this.currentSize = 0;
	}

	public void buildHeap(Integer[] numbers) {
		int i = numbers.length / 2;

		this.currentSize = numbers.length;
		this.heapList = new ArrayList<Integer>();
		this.heapList.add(0);
		this.heapList.addAll(Arrays.asList(numbers));

		while (i > 0) {
			percDown(i);

			i--;
		}
	}

	public boolean isEmpty() {
		return this.currentSize == 0;
	}

	public Integer findMin() {
		if (isEmpty()) {
			throw new IllegalStateException("The queue is empty");
		}

		return this.heapList.get(FIRST);
	}

	public int size() {
		return this.currentSize;
	}

	private void percUp(Integer i) {
		while (i / 2 > 0) {
			if (heapList.get(i) < heapList.get(i / 2)) {
				Integer tmp = heapList.get(i / 2);
				heapList.set(i / 2, heapList.get(i));
				heapList.set(i, tmp);
			}

			i = i / 2;
		}
	}

	private void percDown(int i) {
		while (i * 2 <= this.currentSize) {
			int mc = minChild(i);

			if (this.heapList.get(i) > this.heapList.get(mc)) {
				int tmp = this.heapList.get(i);
				this.heapList.set(i, this.heapList.get(mc));
				this.heapList.set(mc, tmp);
			}

			i = mc;
		}
	}

	private int minChild(int i) {
		int result = 0;

		if (i * 2 + 1 > this.currentSize) {
			result = i * 2;
		} else if (this.heapList.get(i * 2) < this.heapList.get(i * 2 + 1)) {
			result = i * 2;
		} else {
			result = i * 2 + 1;
		}

		return result;
	}

	public Integer delMin() {
		Integer result = this.heapList.get(FIRST);

		heapList.set(FIRST, heapList.get(currentSize));
		heapList.remove(currentSize);
		currentSize--;
		percDown(FIRST);

		return result;
	}

	public void insert(Integer k) {
		this.heapList.add(k);
		this.currentSize = this.currentSize + 1;
		percUp(this.currentSize);
	}

	public static void main(String[] args) {
		BinHeap heap = new BinHeap();

		Integer[] numbers = { 20, 5, 12, 2, 9, 3, 1 };
//		heap.buildHeap(numbers);
		
		for (Integer number  : numbers) {
			heap.insert(number);
		}

		while (!heap.isEmpty()) {
			Integer element = heap.delMin();
			System.out.println(element);
		}
	}
}
