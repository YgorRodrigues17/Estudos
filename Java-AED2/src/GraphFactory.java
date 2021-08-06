import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphFactory {

	private static final int LIST_TYPE = 0;
	private static final int MATRIX_TYPE = 1;

	public Graph createGraphAsMatrix(String path) {
		return createGraph(path, MATRIX_TYPE);
	}

	public Graph createGraphAsList(String path) {
		return createGraph(path, LIST_TYPE);
	}
	
	private Graph createGraph(String path, int type) {
		Graph graph = null;

		int count = 0;

		try {
			FileInputStream stream = new FileInputStream(path);
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			while (reader.ready()) {
				String line = reader.readLine();

				if (count > 0) {
					String[] values = line.split(" ");

					int v = Integer.parseInt(values[0]);
					int w = Integer.parseInt(values[1]);

					graph.addEdge(v, w);
				} else {
					int vertices = Integer.parseInt(line);

					if (type == 0) {
						graph = new GraphAsList(vertices);
					} else if (type == 1) {
						graph = new GraphAsMatrix(vertices);
					}
				}

				count++;
			}
		} catch (IOException e) {
			throw new IllegalStateException("Problems in load data archive");
		}

		return graph;		
	} 
}
