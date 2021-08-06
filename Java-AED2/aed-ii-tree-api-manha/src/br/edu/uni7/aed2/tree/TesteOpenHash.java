package br.edu.uni7.aed2.tree;

public class TesteOpenHash {
	public static void main(String[] args) {
		Map m = new OpenHash();

		Integer keys[] = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
		String values[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };

		for (int i = 0; i < values.length; i++) {
			Integer key = keys[i];
			String value = values[i];

			m.put(key, value);
		}

//		System.out.println(m.toString());
		
		System.out.println(m.get(77));
	}
}
