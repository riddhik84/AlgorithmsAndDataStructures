import java.util.*;

/*
Breadth First Search
Level Order Traversal
Keep track of visited nodes in Graph

0 -> 1,2
1 -> 3,4
2 -> 5,6,7

Time complexity: O(V + E)

Use Queue

*/
public class Graph_BFS_01 {
	
	public static void main(String[] args){
		Graph graph = new Graph();
		GraphNode root = graph.creatAGraph();
		System.out.println(root.getValue());
		
		//print graph BFS
		printGraphBFS(root);
	}
	
	//use Queue
	public static void printGraphBFS(GraphNode root){
		Queue<GraphNode> queue = new LinkedList<>();
		if(root != null){
			queue.offer(root);
			
			while(!queue.isEmpty()){
				GraphNode current = queue.poll();
				current.setVisited(true);
				System.out.println(current.value);
				
				if(current.getAdjacents() != null){
					ArrayList<GraphNode> nodes = current.getAdjacents();
					for(GraphNode n : nodes){
						if(!n.isVisited())
							queue.offer(n);
					}
				}
			}
		}	
	}
}