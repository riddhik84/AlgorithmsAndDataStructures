import java.util.*;

class TreeTraversal {
	
	public static void main(String[] args){
		
		Node root = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);

		root.left = two;
		root.right = three;
		two.left = four;
		two.right = five;
		
		printInOrder(root);
		printPreOrder(root);
		printPostOrder(root);
		
		//System.out.println(BFS(root, 6));
		
		System.out.println(DFS(root, 6));
	}
	
	public static void printInOrder(Node node){
		if(node == null)
			return;
		
		printInOrder(node.left);
		System.out.println(node.data);
		printInOrder(node.right);
	}
	
	public static void printPreOrder(Node node){
		if(node == null)
			return;
		
		System.out.println(node.data);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	public static void printPostOrder(Node node){
		if(node == null)
			return;
		
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.data);
		
	}
	
	public static boolean BFS(Node root, int search){
		System.out.println("BFS......................");
		Queue<Node> queue = new LinkedList<>(); 
		if(root != null)
			queue.add(root);
		
		while(!queue.isEmpty()){
			Node current = queue.poll();
			System.out.println(current.data);
			if(current.data == search)
				return true;
			if(current.left != null && current.left.visited == false){
				queue.add(current.left);
				current.left.visited = true;
			}
			if(current.right != null && current.right.visited == false){
				queue.add(current.right);
				current.right.visited = true;
			}
		}
		return false;
	}
	
	public static boolean DFS(Node root, int search){
		System.out.println("DFS......................");
		Stack<Node> stack = new Stack<>(); 
		if(root != null)
			stack.push(root);
		
		while(!stack.isEmpty()){
			Node current = stack.pop();
			System.out.println(current.data);
			if(current.data == search)
				return true;
			if(current.left != null && current.left.visited == false){
				stack.push(current.left);
				current.left.visited = true;
			}
			if(current.right != null && current.right.visited == false){
				stack.push(current.right);
				current.right.visited = true;
			}
		}
		return false;
	}
}

class Node {
	int data = 0;
	boolean visited = false;
	Node left = null;
	Node right = null;
	
	Node(int data) {
		this.data = data;
	}
	
	void setLeftNode(Node node) {
		left = node;
	}
	
	void setRightNode(Node node){
		right = node;
	}
	
	Node getLeftNode(){
		return left;
	}
	
	Node getRightNode(){
		return right;
	}
	
	int getNodeData(){
		return data;
	}
}