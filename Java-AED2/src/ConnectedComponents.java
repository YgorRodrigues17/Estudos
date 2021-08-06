

import java.util.Iterator; 

public class ConnectedComponents {
	private boolean marked[];
	private int id[];
	private int count;
	
	public ConnectedComponents(Graph graph) {
		marked = new boolean[graph.getNumberOfVertices()];
		id = new int[graph.getNumberOfVertices()];
		count = 0;
		
		for (int v = 0; v < graph.getNumberOfVertices(); v++) {
			if (!marked[v]) {
				dfs(graph, v);
				
				count++;
			}
		}
	}

	private void dfs(Graph graph, int v) {
		marked[v] = true;
		id[v] = count;
		
		Iterator<Integer> adj = graph.getAdjacents(v);
		while (adj.hasNext()) {
			int w = adj.next();
			
			if (!marked[w]) {
				dfs(graph, w);
			}
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public int getId(int v) {
		return id[v];
	}
	
	public boolean connected(int v, int w) {
		return id[v] == id[w];
	}
}

