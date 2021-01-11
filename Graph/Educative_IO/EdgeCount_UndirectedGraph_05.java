import java.util.*;

/*
Depth First Search
Keep track of visited nodes in Graph

0 -> 1,2
1 -> 3,4
2 -> 5,6,7

Time complexity: O(V + E)

Recursion

*/
public class EdgeCount_UndirectedGraph_05 {
	static int edgeCount = 0;
	
	public static void main(String[] args){
		Graph graph = new Graph();
		GraphNode root = graph.creatAGraph();
		System.out.println(root.getValue());
		
		//print graph DFS
		depthFirstSearch(root);
		//total edges
		System.out.println("Total edges: " + edgeCount);
	}
	
	//recursion	
	public static void depthFirstSearch(GraphNode node) {
		node.setVisited(true);
		System.out.print(node.value + " ");

		ArrayList<GraphNode> allNeighbors = node.getAdjacents();
		if (allNeighbors == null)
			return;
		else
			edgeCount = edgeCount + allNeighbors.size();

		for (GraphNode neighbor : allNeighbors) {
			if (!neighbor.isVisited())
				depthFirstSearch(neighbor);
		}
	}
}


