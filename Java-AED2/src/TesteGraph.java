import java.util.Iterator;

public class TesteGraph {

	public static void main(String[] args) {
		 Graph g1 = new Graph(7);
	        
		 /* Criando um grafo
	        g1.addEdge(0, 2);
	        g1.addEdge(0, 3);
	        g1.addEdge(0, 6);
	        g1.addEdge(1, 4);
	        g1.addEdge(2, 6);*/
		 
		    g1.addEdge(0, 1);
	        g1.addEdge(0, 2);
	        g1.addEdge(0, 5);
	        g1.addEdge(0, 6);
	        
	        g1.addEdge(3, 4);
	        g1.addEdge(3, 5);
	        
	        g1.addEdge(4, 5);
	        g1.addEdge(4, 6);
	        

	        
	        System.out.println("Number of Edges : "+g1.getNumberOfEdges());
	        System.out.println("Number Of Vertices : "+g1.getNumberOfVertices());
	        System.out.println("Adjacentes of 0 : ");
	        
	        Iterator<Integer> it = g1.getAdjacentes(0);
	        while(it.hasNext()) {
	        	Integer i = it.next();
	        	System.out.println(i);
	        }
	        System.out.println("Degree of 0 : "+g1.getDegree(0));
	        System.out.println("Degree of 3 : "+g1.getDegree(3));
	        System.out.println("Degree of 4 : "+g1.getDegree(4));
	        
		 
		 




	    }

	}
