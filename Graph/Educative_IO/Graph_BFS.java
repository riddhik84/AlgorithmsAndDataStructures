import java.util.*;

public class Graph_BFS {
	
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
				System.out.println(current.value);
				
				if(current.getAdjacents() != null){
					ArrayList<GraphNode> nodes = current.getAdjacents();
					for(GraphNode n : nodes){
						queue.offer(n);
					}
				}
			}
		}	
	}
}