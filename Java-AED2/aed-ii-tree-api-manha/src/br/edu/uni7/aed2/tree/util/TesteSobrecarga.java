package br.edu.uni7.aed2.tree.util;

public class TesteSobrecarga {
	public static void main(String[] args) {
		String s = "hello";
		int i = 10;
		int j = 20;

		System.out.println(i + j);
		System.out.println(s + i);
		System.out.println(s + i + j);
		System.out.println(i + j + s);
	}
}
