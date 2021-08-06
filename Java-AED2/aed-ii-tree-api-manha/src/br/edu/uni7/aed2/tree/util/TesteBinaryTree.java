package br.edu.uni7.aed2.tree.util;

import br.edu.uni7.aed2.tree.BinaryTree;

public class TesteBinaryTree {
	public static void main(String[] args) {
		BinaryTree<String> r = new BinaryTree<String>("a");
		r.insertLeft("b");
		r.insertRight("c");

		r.insertLeft("k");

		r.insertLeft("m");

		System.out.println(r);
		
		BinaryTree<Integer> r2 = new BinaryTree<Integer>(20);
		r2.insertLeft(10);
		r2.insertRight(11);

		r2.insertLeft(12);

		r2.insertLeft(13);

		System.out.println(r2);
	}
}
