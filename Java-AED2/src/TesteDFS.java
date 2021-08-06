import java.util.Iterator;

public class TesteDFS {
	public static void main(String[] args) {
		Graph graph = new GraphAsMatrix(13);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 5);
		graph.addEdge(0, 6);

		graph.addEdge(3, 4);
		graph.addEdge(3, 5);

		graph.addEdge(4, 5);
		graph.addEdge(4, 6);
		
		graph.addEdge(7, 8);
		
		graph.addEdge(9, 10);
		graph.addEdge(9, 11);
		graph.addEdge(9, 12);
		
		graph.addEdge(11, 12);
		
		int source = 0;
		System.out.println("\nUsing depth search ...");
		DepthFirstPaths dfs = new DepthFirstPaths(graph, source);
		Iterator<Integer> vertices= graph.getVertices();
		while (vertices.hasNext()) {
			int v = vertices.next();

			boolean hasPath = dfs.hasPathTo(v);
			if (hasPath) {
				System.out.println("Path of " + source + " for " + v + ": ");
				Iterator<Integer> path = dfs.pathTo(v);	
				while (path.hasNext()) {
					System.out.print(path.next() + ", ");
				}
				
				System.out.println();
			} else {
				System.err.println("Don´t exist path of " + source + " for " + v);
			}
		}
		
		System.out.println("\nUsing width search ...");
		BreadthFirstPaths bfs = new BreadthFirstPaths(graph, source);
		vertices = graph.getVertices();
		while (vertices.hasNext()) {
			int v = vertices.next();

			boolean hasPath = bfs.hasPathTo(v);
			if (hasPath) {
				System.out.println("Path of " + source + " for " + v + ": ");
				Iterator<Integer> path = bfs.pathTo(v);	
				while (path.hasNext()) {
					System.out.print(path.next() + ", ");
				}
				
				System.out.println();
			} else {
				System.err.println("Don´t exist path of " + source + " for " + v);
			}
		}
	}
}
