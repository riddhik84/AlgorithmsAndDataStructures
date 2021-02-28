import java.util.*;

/*
Graph Structure
 |0| -> 1, 2
 |1| -> 3
 |2| -> 4

Time complexity: O(V + E)

*/

//Directed Graph
public class FindPathBetweenNodes_06 {
	
	public static void main(String[] args){
		DirectedGraph graph = new DirectedGraph(5);
		//Add edges no cycle
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,3);
		graph.addEdge(2,4);
		
		boolean result = isPathExist(3, 4);
		System.out.println("Path between nodes 3 and 4: " + result);
	}
	
	public static boolean isPathExist(DirectedGraph graph, int source, int destination){
		Queue<Integer> queue = new LinkedLis<>();
		
		
		
	}
	
		
}