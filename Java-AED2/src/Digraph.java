import java.util.Iterator;

public abstract class Digraph {
	protected int numberOfVertices;
	protected int numberOfEdges;

	public Digraph(int vertices) {
		this.numberOfVertices = vertices;
	}

	public abstract void addEdge(int v, int w);

	public abstract Iterator<Integer> getAdjacents(int v);

	public int getNumberOfVertices() {
		return numberOfVertices;
	}

	public int getNumberOfEdges() {
		return numberOfEdges;
	}
}
