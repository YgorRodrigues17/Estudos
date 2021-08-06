import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DigraphAsList extends Digraph {
	private List<Integer>[] adj;

	public DigraphAsList(int vertices) {
		super(vertices);

		adj = new ArrayList[numberOfVertices];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}

	public Iterator<Integer> getAdjacents(int v) {
		return adj[v].iterator();
	}

	public void addEdge(int v, int w) {
		int indexW = Collections.binarySearch(adj[v], w);
		int insertion = -indexW - 1;
		adj[v].add(insertion, w);

		numberOfEdges++;
	}
}
