

import java.util.Iterator;

public class ProblemaGraphAsList {
	public static void main(String[] args) {
		Graph graph = new GraphAsList(13);
		
		graph.addEdge(0, 2);
		graph.addEdge(0, 1);
				
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 7);
		graph.addEdge(5, 6);
		graph.addEdge(5, 8);
		graph.addEdge(5, 9);
		graph.addEdge(6, 9);
		
		graph.addEdge(7, 9);
		graph.addEdge(7, 10);
		
		graph.addEdge(8, 9);
		
		graph.addEdge(9, 11);
		graph.addEdge(9, 10);
		
		graph.addEdge(10, 12);
		graph.addEdge(11, 12);
		
		Iterator<Integer> adj = graph.getAdjacents(7);
		while (adj.hasNext()) {
			System.out.println(adj.next());
		}
		
		System.out.println("OK");
	}
}

