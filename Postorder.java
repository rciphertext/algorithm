// Java program for different tree traversals 

/* Class containing left and right child of current 
node and key value*/
class Node 
{ 
	int key; 
	Node left, right; 

	public Node(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
} 

class Postorder
{ 
	// Root of Binary Tree 
	Node root; 

	Postorder() 
	{ 
		root = null; 
	} 

	/* Given a binary tree, print its nodes according to the 
	"bottom-up" postorder traversal. */
	void printPostorder(Node node) 
	{ 
		if (node == null) 
			return; 

		// first recur on left subtree 
		printPostorder(node.left); 

		// then recur on right subtree 
		printPostorder(node.right); 

		// now deal with the node 
		System.out.print(node.key + " "); 
	} 

	
	// Wrappers over above recursive functions 
	void printPostorder() {	 printPostorder(root); } 

	// Driver method 
	public static void main(String[] args) 
	{ 
		Postorder tree = new Postorder(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 

		System.out.println("\nPostorder traversal of binary tree is "); 
		tree.printPostorder(); 
	} 
} 
