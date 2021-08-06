import java.util.List;
import java.util.ArrayList;
public class WeightedGraph {
    private int numberOfEdges;
    private int numberOfVertices;
    private int [][] adj;

    public WeightedGraph(int numberOfVertices){
        this.numberOfVertices = numberOfVertices;
        this.adj = new int[numberOfVertices][numberOfVertices];

        for(int i = 0; i < adj.length; i++){
            for(int j = 0; j < adj.length; j++){
                adj[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    public void addEdge(int v, int w, int weighted){
        adj[v][w] = weighted;
        adj[v][w] = weighted;

        numberOfEdges++;
    }

    public List<Integer> getAdjacentes(int v){
        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < adj.length; i++){
            if(adj[v][i]< Integer.MAX_VALUE){
                result.add(i);
            }
        }
        return result;
    }

    public int getWeighted(int v, int w){
        return adj[v][w];
    }

    public int getNumberOfVertices(){
        return numberOfVertices;
    }

    public int getNumberOfEdges(){
        return numberOfEdges;
    }
}
