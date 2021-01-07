/*
Graph structure:

0 -> 1,2
1 -> 3,4
2 -> 5,6,7

*/

public class Graph {
	
	public Graph() {
	}
	
	public GraphNode creatAGraph(){
		GraphNode n0 = new GraphNode(0);
		GraphNode n1 = new GraphNode(1);
		GraphNode n2 = new GraphNode(2);
		GraphNode n3 = new GraphNode(3);
		GraphNode n4 = new GraphNode(4);
		GraphNode n5 = new GraphNode(5);
		GraphNode n6 = new GraphNode(6);
		GraphNode n7 = new GraphNode(7);
		
		//n0
		n0.addAdjacentNode(n1);
		n0.addAdjacentNode(n2);
		//n1
		n1.addAdjacentNode(n3);
		n1.addAdjacentNode(n4);
		//n2
		n2.addAdjacentNode(n5);
		n2.addAdjacentNode(n6);
		n2.addAdjacentNode(n7);
		
		return n0;
	}
}