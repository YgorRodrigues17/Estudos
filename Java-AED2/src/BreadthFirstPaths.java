import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstPaths {
	private boolean marked[];
	private int edgeTo[];
	private int distTo[];
	private int source;
	
	public BreadthFirstPaths(Graph graph, int source) {
		this.source = source;
		marked = new boolean[graph.getNumberOfVertices()];
		edgeTo = new int[graph.getNumberOfVertices()];
		distTo = new int[graph.getNumberOfVertices()];
		
		bfs(graph, source);
		marked[source] = false;
	}

	private void bfs(Graph graph, int s) {
		Queue<Integer> q = new LinkedList<Integer>();	
		q.add(s);
		marked[s] = true;
		distTo[s] = 0;
		
		while (!q.isEmpty()) {
			int v = q.remove();
			
			Iterator<Integer> adjacents = graph.getAdjacents(v);
			while (adjacents.hasNext()) {
				int w = adjacents.next();
				
				if (!marked[w]) {
					q.add(w);
					
					marked[w] = true;
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
				}
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
		for(int x = v; x != source; x = edgeTo[x]) {
			path.push(x);
		}
		
		path.push(source);
		
		return path.iterator();
	}
	
	public int getDistanceTo(int v) {
		return distTo[v];
	}
}
