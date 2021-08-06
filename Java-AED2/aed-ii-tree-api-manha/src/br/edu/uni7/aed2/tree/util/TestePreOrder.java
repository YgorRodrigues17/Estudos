package br.edu.uni7.aed2.tree.util;

import br.edu.uni7.aed2.algs.Traversals;
import br.edu.uni7.aed2.tree.BinaryTree;

public class TestePreOrder {
	public static void main(String[] args) {
		BinaryTree<String> r = new BinaryTree<String>("Book");

		r.insertLeft("Chapter 1");
		r.insertRight("Chapter 2");

		BinaryTree<String> chapter1 = r.getLeftChild();
		chapter1.insertLeft("Section 1.1");
		chapter1.insertRight("Section 1.2");

		BinaryTree<String> chapter2 = r.getRightChild();
		chapter2.insertLeft("Section 2.1");
		chapter2.insertRight("Section 2.2");

		Traversals<String> traversals = new Traversals<String>();
		System.out.println("PreOrder: ");
		traversals.preOrder(r);
		System.out.println();
		
		System.out.println("InOrder: ");
		traversals.inOrder(r);
		System.out.println();
		
		System.out.println("PosOrder: ");
		traversals.posOrder(r);
	}
}
