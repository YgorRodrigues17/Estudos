import java.util.List;

public class TesteWeightedGraph {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(7);

        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 2);
        graph.addEdge(0, 3, 2);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 5, 2);
        graph.addEdge(4, 6, 1);

        List<Integer> adj = graph.getAdjacentes(0);
        for(Integer n : adj){
            int w = graph.getWeighted(0, n);

            System.out.println(w);
        }

    }
    
}
