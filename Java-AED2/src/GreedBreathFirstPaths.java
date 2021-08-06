import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Iterator;
import java.util.Stack;

public class GreedBreathFirstPaths {
    private boolean marked[];
    private int edgeTo[];
    private int distTo[];
    private int source;

    public GreedBreathFirstPaths(WeightedGraph graph, int source){
        this.source = source;
        marked = new boolean[graph.getNumberOfVertices()];
        edgeTo = new int[graph.getNumberOfEdges()];
        distTo = new int[graph.getNumberOfVertices()];

        bfs(graph, source);
        marked[source] = false;
    }
    private void bfs(WeightedGraph graph, int s){
        Queue<Integer> q =  new LinkedList<Integer>();

        q.add(s);
        marked[s] = true;
        distTo[s] = 0;

        while(!q.isEmpty()){
            int v = q.remove();

            int bestWeighted = Integer.MAX_VALUE;
            int w = -1;
            List<Integer> adjacentes = graph.getAdjacentes(v);
            for(Integer n : adjacentes){
                if(!marked[n]){
                    int weighted = graph.getWeighted(v, n);

                    if(weighted < bestWeighted){
                        bestWeighted = weighted;
                        w = n;
                    }
                }
            }
            if(w > 0){
                q.add(w);

                marked[w] = true;
                edgeTo[w] = v;
                distTo[w] = distTo[v] + graph.getWeighted(v, w);
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
