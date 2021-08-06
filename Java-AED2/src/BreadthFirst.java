

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class BreadthFirst extends Paths {
	public BreadthFirst(Graph graph, int source) {
		super(graph, source);
	}

	protected void execute(Graph graph, int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		marked[s] = true;

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
}



