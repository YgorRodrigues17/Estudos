import java.util.Iterator;
import java.util.Stack;

public class DepthFirstPaths {
	private boolean[] marked;
	private int[] edgeTo;
	private int s;
	
	public DepthFirstPaths(Graph graph, int source) {
		s = source;
		marked = new boolean[graph.getNumberOfVertices()];
		edgeTo = new int[graph.getNumberOfVertices()];

		dfs(graph, source);
		marked[source] = false;
	}
	
	private void dfs(Graph graph, int v) {
		marked[v] = true;

		Iterator<Integer> adjacents = graph.getAdjacents(v);
		while (adjacents.hasNext()) {
			int w = adjacents.next();

			if (!marked[w]) {
				edgeTo[w] = v;
				
				dfs(graph, w);
			}
		}
	}
	
	public boolean hasPathTo(int v) {
		return marked[v];
	}
	
	public Iterator<Integer> pathTo(int v) {
		if (!hasPathTo(v)) {
			return null;
		}
		
		// LIFO
		Stack<Integer> path = new Stack<Integer>();
		for(int x = v; x != s; x = edgeTo[x]) {
			path.push(x);
		}
		
		path.push(s);
		
		return path.iterator();
	}
}
