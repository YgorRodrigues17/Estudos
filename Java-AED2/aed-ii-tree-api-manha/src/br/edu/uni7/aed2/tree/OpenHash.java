package br.edu.uni7.aed2.tree;

import java.util.Arrays;

public class OpenHash implements Map {
	private int size;
	private Integer[] slots;
	private Object[] data;

	public OpenHash() {
		this.size = 17;
		slots = new Integer[size];
		data = new Object[size];
	}

	@Override
	public void put(Integer key, Object value) {
		int hashValue = hash(key, size);

		if (slots[hashValue] == null) {
			slots[hashValue] = key;
			data[hashValue] = value;
		} else {
			if (slots[hashValue] == key) {
				data[hashValue] = value;
			} else {
				int nextslot = rehash(hashValue, size);

				while (slots[nextslot] != null && slots[nextslot] != key) {
					nextslot = rehash(nextslot, size);
				}

				if (slots[nextslot] == null) {
					slots[nextslot] = key;
					data[nextslot] = value;
				} else {
					data[nextslot] = value;
				}
			}
		}

		System.out.println("Inserida chave " + key);
	}

	private int rehash(Integer oldHash, int size) {
		return (oldHash + 1) % size;
	}

	private int hash(Integer key, int size) {
		return key % size;
	}

	@Override
	public Object get(Integer key) {
		int startslot = hash(key, size);

		Object result = null;
		boolean stop = false;
		boolean found = false;
		int position = startslot;

		while ((slots[position] != null) && (!found) && (!stop)) {
			if (slots[position] == key) {
				found = true;
				result = data[position];
			} else {
				position = rehash(position, size);

				if (position == startslot) {
					stop = true;
				}
			}
		}

		return result;
	}

	@Override
	public Object remove(Integer key) {
		return null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("{");
		builder.append(Arrays.toString(slots));
		builder.append(", \n");
		builder.append(Arrays.toString(data));
		builder.append("}");

		return builder.toString();
	}
}
