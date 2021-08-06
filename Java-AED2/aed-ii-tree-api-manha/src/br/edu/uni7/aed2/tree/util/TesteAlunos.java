package br.edu.uni7.aed2.tree.util;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class TesteAlunos {
	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[11];

		Aluno a1 = new Aluno(123456, "Joao", new GregorianCalendar());
		Aluno a2 = new Aluno(455654, "Maria", new GregorianCalendar());
		Aluno a3 = new Aluno(789456, "Jose", new GregorianCalendar());

		int result = hash(a1);
		alunos[result] = a1;

		result = hash(a2);
		alunos[result] = a2;

		result = hash(a3);
		alunos[result] = a3;

		System.out.println("amor: " + hash("amor", 11));

		System.out.println();

		System.out.println("roma: " + hash("roma", 11));
	}

	public static int hash(String astring, int tableSize) {
		int sum = 0;

		for (int i = 0; i < astring.length(); i++) {
			char c = astring.charAt(i);

			System.out.println(c + " : " + Character.getNumericValue(c) + " * " + (i + 1));

			sum += Character.getNumericValue(c) * (i + 1);
		}

		System.out.println("Sum: " + sum);

		return sum % tableSize;
	}

	public static int hash(Aluno aluno) {
		int result = -1;

		result = aluno.getMatricula() % 11;

		return result;
	}

	public static void printMaria(Aluno[] alunos) {
		for (Aluno a : alunos) {
			if (a.getNome().equals("Maria")) {
				System.out.println(a.getMatricula() + ", " + a.getNome() + " : " + a.getDataNascimento());
			}
		}
	}
}
