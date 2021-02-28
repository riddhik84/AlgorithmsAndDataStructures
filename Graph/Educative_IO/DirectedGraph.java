
/*
Directed Graph
 |0| -> 1, 2
 |1| -> 3
 |2| -> 4
 |3| -> 2

array of linked list. 
Each array count is a vertex. A linked list attached to that array count is its directed nodes.

 
Example:
int[] test = new int[5];
LinkedList<Integer>[] test = new LinkedList<>[5]

*/


import java.util.*;

public class DirectedGraph {
	int vertices;
	LinkedList<Integer>[] adjacencyList;
	
	public DirectedGraph(int vertices){
		this.vertices = vertices;
		adjacencyList =  new LinkedList<Integer>[vertices];
		
		for(int i = 0; i < vertices; i++){
			adjacencyList[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int destination){
		if (source < vertices && destination < vertices){
			this.adjacencyList[source].addLast(destination);
        }
	}
	
	public LinkedList<Integer> getAdjacents (int node){
		return adjacencyList[node];
	}
	
}