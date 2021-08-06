

import java.util.Iterator;

public class DepthFirst extends Paths{
	public DepthFirst(Graph graph, int source) {
		super(graph, source);
	}

	protected void execute(Graph graph, int v) {
		marked[v] = true;

		Iterator<Integer> adjacents = graph.getAdjacents(v);
		while (adjacents.hasNext()) {
			int w = adjacents.next();

			if (!marked[w]) {
				edgeTo[w] = v;
				distTo[w] = distTo[v] + 1; 
				
				execute(graph, w);
			}
		}
	}
}











	
