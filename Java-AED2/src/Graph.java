import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Graph {
	int numberOfEdges;
	int numberOfVertices;

//	public Graph(InputStream stream) {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
//
//		try {
//			while (reader.ready()) {
//				String line = reader.readLine();
//				
//				String[] values = line.split(" ");
//				
//				int v = Integer.parseInt(values[0]);
//				int w = Integer.parseInt(values[1]);
//				
//				addEdge(v, w);
//			}			
//		} catch (IOException e) {
//			throw new IllegalStateException("Problems in load data archive");
//		}
//	}

	public Graph(int nVertices) {
		numberOfVertices = nVertices;
	}

	public abstract void addEdge(int v, int w);

	public abstract int getDegree(int v);

	public abstract Iterator<Integer> getAdjacents(int v);

	public abstract boolean areNeighbors(int v, int w);

	public int getNumberOfVertices() {
		return numberOfVertices;
	}

	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	public Iterator<Integer> getVertices() {
		List<Integer> vertices = new ArrayList<Integer>();

		for (int i = 0; i < numberOfVertices; i++) {
			vertices.add(i);
		}

		return vertices.iterator();
	}
}
