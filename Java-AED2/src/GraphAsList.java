import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GraphAsList extends Graph {
	private List<Integer>[] adj;

	public GraphAsList(int nVertices) {
		super(nVertices);

		adj = new ArrayList[numberOfVertices];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}

	public Iterator<Integer> getAdjacents(int v) {
		List<Integer> neighbors = adj[v];

		return neighbors.iterator();
	}

	public boolean areNeighbors(int v, int w) {
		boolean found = false;

		List<Integer> neighbors = adj[v];
		for (Integer vertice : neighbors) {
			if (vertice == w) {
				found = true;
				break;
			}
		}

		return found;
	}

	public void addEdge(int v, int w) {
		int indexW = Collections.binarySearch(adj[v], w);
		int indexV = Collections.binarySearch(adj[w], v);

		if (indexW >= 0 || indexV >= 0) {
			throw new IllegalArgumentException("Já existe uma aresta ligando o " + v + " ao " + w);
		}

		int insertion = -indexW - 1;
		adj[v].add(insertion, w);

		insertion = -indexV - 1;
		adj[w].add(insertion, v);

		numberOfEdges++;
	}

	public int getDegree(int v) {
		return adj[v].size();
	}
}
