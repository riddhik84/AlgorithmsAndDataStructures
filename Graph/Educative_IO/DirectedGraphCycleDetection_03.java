import java.util.*;

/*
Graph Structure
 |0| -> 1, 2
 |1| -> 3
 |2| -> 4
 |3| -> 2


*/
public class DirectedGraphCycleDetection_03 {
	
	public static void main(String[] args){
		DirectedGraph graph = new DirectedGraph(5);
		//Add edges no cycle
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,3);
		graph.addEdge(2,4);
		System.out.println("Detect cycle: " + detectCycle(graph));
		
		//Add edge for cycle
		graph.addEdge(3,2);
		System.out.println("Detect cycle: " + detectCycle(graph));
	}
	
	public static boolean detectCycle(DirectedGraph graph){
        int num_of_vertices = graph.vertices;

        //Boolean Array to hold the history of visited nodes (by default-false)
        boolean[] visited = new boolean [num_of_vertices];
        //Holds a flag if the node is currently in Stack or not (by default- false)
        boolean[] stackFlag = new boolean[num_of_vertices];

        for (int i = 0; i < num_of_vertices; i++){
            //Check cyclic on each node
            if (cyclic(graph, i, visited, stackFlag)){
                return true;
            }
        }
        return false;
    }
	
	public static boolean cyclic(DirectedGraph graph, int v, boolean[] visited, boolean[] stackFlag){
        //if node is currently in stack that means we have found a cycle
        if (stackFlag[v])
            return true;

        //if it is already visited (and not in Stack) then there is no cycle
        if (visited[v])
            return false;

        visited[v] = true;
        stackFlag[v] = true;

        //check adjacency list of the node
        LinkedList<Integer> temp = null;
        if (graph.adjacencyList[v] != null)
            temp = graph.adjacencyList[v].headNode;

        while (temp != null) {
            //run cyclic function recursively on each outgowing path
            if(cyclic(graph, temp.data, visited, stackFlag)){
                return true;
            }
            temp = temp.nextNode;
        }
        stackFlag[v] = false;

        return false;
    }
}


