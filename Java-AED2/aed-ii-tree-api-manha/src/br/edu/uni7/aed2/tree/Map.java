package br.edu.uni7.aed2.tree;

public interface Map {
	public void put(Integer key, Object value);

	public Object get(Integer key);

	public Object remove(Integer key);
}
