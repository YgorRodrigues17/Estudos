public class MyGraph {
	public static void main(String[] args) {
		Graph graph = new GraphAsMatrix(5);
		
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);
		
		
	}
}
