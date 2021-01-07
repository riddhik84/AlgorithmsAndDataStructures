import java.util.*;

public class GraphNode {
	int value;
	ArrayList<GraphNode> adjacents;
	boolean visited;
	
	public GraphNode(){
	}
	
	public GraphNode(int value){
		this.value = value;
		adjacents = new ArrayList<>();
		visited = false;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public void addAdjacentNode(GraphNode node){
		adjacents.add(node);
	}
	
	public GraphNode getAdjacentNode(int index){
		if(adjacents != null && adjacents.size() > 0){
			return adjacents.get(index);
		}
		return null;
	}

	public ArrayList<GraphNode> getAdjacents(){
		return adjacents;
	}
	
	public void setVisited(boolean visit){
		visited = visit;
	}
	
	public boolean isVisited(GraphNode node){
		return visited;
	}
}