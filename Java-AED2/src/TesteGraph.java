import java.util.Iterator;

public class TesteGraph {
	public static void main(String[] args) {
		Graph g1 = new Graph();
			
		
		
		g1.addEdge(0, 1);
		g1.addEdge(0, 2);
		g1.addEdge(0, 5);
		g1.addEdge(0, 6);
		
		g1.addEdge(3, 4);
		g1.addEdge(3, 5);
		
		g1.addEdge(4, 5);
		g1.addEdge(4, 6);
		
		System.out.println("NumberOfEdges: " + g1.getNumberOfEdges());
		System.out.println("NumberOfVertices: " + g1.getNumberOfVertices());
		System.out.println("Adjacents of 4: ");
		Iterator<Integer> it = g1.getAdjacents(4);
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println("Degree of 0: " + g1.getDegree(0));
		System.out.println("Degree of 3: " + g1.getDegree(3));
		System.out.println("Degree of 4: " + g1.getDegree(4));
	}
}

