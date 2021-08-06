import java.util.Iterator;

public class TestComponents {
	public static void main(String[] args) {
		Graph graph = new GraphAsList(13);

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
		
		ConnectedComponents cc = new ConnectedComponents(graph);
		
		System.out.println("Number of Components: " + cc.getCount());
		
		Iterator<Integer> vertices = graph.getVertices();
		while (vertices.hasNext()) {
			int v = vertices.next();
			
			System.out.println("Vertice " + v + " is in component " + cc.getId(v));
		}
		
		System.out.println("2 to 9: " + cc.connected(2, 9));
		System.out.println("0 to 6: " + cc.connected(0, 6));
		System.out.println("7 to 11: " + cc.connected(7, 11));
		
	}
}
