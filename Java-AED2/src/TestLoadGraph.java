import java.util.Iterator;

public class TestLoadGraph {
	public static void main(String[] args) throws Exception {
		String pathToFile = "/home/roberio/eclipse-workspace/aed-ii-graph-api-manha/src/br/edu/uni7/aed2/graph/graph-manha.txt";

		GraphFactory factory = new GraphFactory();
		Graph graph = factory.createGraphAsMatrix(pathToFile);

		int source = 0;
		System.out.println("\nUsando Busca em Profundidade ...");
		DepthFirstPaths dfs = new DepthFirstPaths(graph, source);
		Iterator<Integer> vertices= graph.getVertices();
		while (vertices.hasNext()) {
			int v = vertices.next();

			boolean hasPath = dfs.hasPathTo(v);
			if (hasPath) {
				System.out.println("Caminho de " + source + " para " + v + ": ");
				Iterator<Integer> path = dfs.pathTo(v);	
				while (path.hasNext()) {
					System.out.print(path.next() + ", ");
				}
				
				System.out.println();
			} else {
				System.err.println("Não existe caminho de " + source + " para " + v);
			}
		}
	}

}
