

import java.util.Iterator;
import java.util.Stack;


public abstract class Paths {
	protected boolean[] marked;
	protected int[] edgeTo;
	protected int source;
	protected int distTo[];
	
	public Paths(Graph graph, int source) {
		this.source = source;
		marked = new boolean[graph.getNumberOfVertices()];
		edgeTo = new int[graph.getNumberOfVertices()];
		distTo = new int[graph.getNumberOfVertices()];
		
		execute(graph, source);
		marked[source] = false;
	}
	
	protected abstract void execute(Graph graph, int v);
	
	public boolean hasPathTo(int v) {
		return marked[v];
	}
	
	public Iterator<Integer> pathTo(int v) {
		if (!hasPathTo(v)) {
			return null;
		}
		
		// LIFO
		Stack<Integer> path = new Stack<Integer>();
		for(int x = v; x != source; x = edgeTo[x]) {
			path.push(x);
		}
		
		path.push(source);
		
		return path.iterator();
	}
}

