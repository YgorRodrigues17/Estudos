import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GraphAsMatrix extends Graph {
	private int[][] adj;
	
//	public GraphAsMatrix(InputStream stream) {
//		super(stream);
//	}

	public GraphAsMatrix(int nVertices) {
		super(nVertices);

		adj = new int[numberOfVertices][numberOfVertices];
	}

	public void addEdge(int v, int w) {
		adj[v][w] = 1;
		adj[w][v] = 1;

		numberOfEdges++;
	}
	
	public Iterator<Integer> getAdjacents(int v) {
		List<Integer> adjacentes = new ArrayList<Integer>();
		
		for (int i = 0; i < numberOfVertices; i++) {
			if (adj[v][i] == 1) {
				adjacentes.add(i);
			}
		}
		
		return adjacentes.iterator();
	}
	
	public boolean areNeighbors(int v, int w) {
		return (adj[v][w] == 1);
	}

	public int getDegree(int v) {
		int degree = 0;

		for (int i = 0; i < numberOfVertices; i++) {
			if (adj[v][i] == 1) {
				degree++;
			}
		}

		return degree;
	}
}
