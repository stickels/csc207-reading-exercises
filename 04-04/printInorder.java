public void printInorder(){
	printInorder(root);
}
public void printInorder(Node<T> cur){
	if (cur != null){
		printInorder(cur.left);
		System.out.println(cur);
		printInorder(cur.right);
	}
}
