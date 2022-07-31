package com.assignment.one;

class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class TransactionData {
	Node root;
	private Node tempNode = null;
    Node skewHead = null;

	public void makeSkew(Node current) {
		if (current == null) {
			return;
		}
		
		makeSkew(current.left);
		
		if(skewHead==null) {
			skewHead=current;
			current.left=null;
			tempNode=current;
		}
		else {
			tempNode.right=current;
			current.left=null;
			tempNode=current;
		}
		makeSkew(current.right);
	}

	 void Inorder(Node curr){
		 
		 if(curr==null) {
			 return;
		 }
		 System.out.println(curr.data + " ");
		 Inorder(curr.right);
	 }
 }
