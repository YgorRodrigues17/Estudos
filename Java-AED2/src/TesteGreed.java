import java.util.Iterator;

public class TesteGreed {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(6);

        graph.addEdge(0, 1, 3);
        graph.addEdge(0, 2, 8);
        graph.addEdge(0, 3, 4);
        graph.addEdge(0, 5, 10);
        graph.addEdge(1, 3, 6);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 1);
        graph.addEdge(3, 5, 3);
        graph.addEdge(4, 5, 1);

        GreedBreathFirstPaths greed = new GreedBreathFirstPaths(graph, 0);

        int distance = greed.getDistanceTo(5);

        Iterator<Integer> path = greed.pathTo(5);
        while(path.hasNext()){
            int w = path.next();

            System.out.println(w + ",");
        }
    }
}
