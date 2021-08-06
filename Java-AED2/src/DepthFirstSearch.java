import java.util.Iterator;

public class DepthFirstSearch {
	private boolean[] marked;
	private int count;

	public DepthFirstSearch(Graph graph, int source) {
		marked = new boolean[graph.getNumberOfVertices()];

		dfs(graph, source);
	}

	private void dfs(Graph graph, int v) {
		count++;

		marked[v] = true;

		Iterator<Integer> adjacents = graph.getAdjacents(v);
		while (adjacents.hasNext()) {
			int w = adjacents.next();

			if (!marked[w]) {
				dfs(graph, w);
			}
		}
	}

	public boolean isMarked(int v) {
		return marked[v];
	}

	public int getCount() {
		return count;
	}
}
