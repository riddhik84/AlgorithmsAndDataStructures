import java.util.*;

/*
Depth First Search
Keep track of visited nodes in Graph

0 -> 1,2
1 -> 3,4
2 -> 5,6,7

Time complexity: O(n)

Use Stack

*/
public class Graph_DFS_02 {
	
	public static void main(String[] args){
		Graph graph = new Graph();
		GraphNode root = graph.creatAGraph();
		System.out.println(root.getValue());
		
		//print graph DFS
		depthFirstSearch(root);
	}
	
	//recursion	
	public static void depthFirstSearch(GraphNode node) {
		node.setVisited(true);
		System.out.print(node.value + " ");

		ArrayList<GraphNode> allNeighbors = node.getAdjacents();
		if (allNeighbors == null)
			return;

		for (GraphNode neighbor : allNeighbors) {
			if (!neighbor.isVisited())
				depthFirstSearch(neighbor);
		}
	}
}


