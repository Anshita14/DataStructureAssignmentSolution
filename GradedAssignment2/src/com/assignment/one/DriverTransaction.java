package com.assignment.one;

public class DriverTransaction {

	public static void main(String[] args) {
		TransactionData tranData = new TransactionData();
		tranData.root = new Node(50);
		tranData.root.left = new Node(30);
		tranData.root.right = new Node(60);
		tranData.root.left.left = new Node(10);
		tranData.root.right.left = new Node(55);
		tranData.makeSkew(tranData.root);
		tranData.Inorder(tranData.skewHead);
	}

}
