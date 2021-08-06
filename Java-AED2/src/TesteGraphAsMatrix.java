import java.util.Iterator;

public class TesteGraphAsMatrix {

	public static void main(String[] args) {
		 GraphAsMatrix g1 = new GraphAsMatrix(7);
		 
		 

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
	        
	        Iterator<Integer> it2 = g1.getVertices();
	        while(it2.hasNext()) {
	        	Integer i2 = it2.next();
	        	System.out.println(i2);
	        }
	      
	        
	        System.out.println("Neighbors : "+g1.areNeighbors(1, 6));
	        
	       

	}

}
