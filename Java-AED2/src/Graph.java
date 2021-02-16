import java.util.*;
public class Graph {
	private int numberOfVertices;
	private int numberOfEdges;
	private List<Integer>[] adjacent;
	
	public Graph(){}

    public Graph(int v){
        numberOfVertices = v;
        adjacent = new ArrayList[numberOfVertices];
        for(int i = 0; i< adjacent.length; i++) {
        	adjacent[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int v, int w){
        adjacent[v].add(w);
        adjacent[w].add(v);
        
        numberOfEdges++;
    }
    int getDegree(int v) {
    	return adjacent[v].size();
        
    }
    
    Iterator<Integer> getAdjacentes(int v){
      
    	return adjacent[v].iterator();
    }
    
    int getNumberOfVertices(){
        
        return numberOfVertices;
    }
    
    int getNumberOfEdges(){
        
        return numberOfEdges;
    }

}

