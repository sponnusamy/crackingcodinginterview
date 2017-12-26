package com.me.crack.others;

public class BinaryTree {
	static boolean checkBST(Node root) {
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	static boolean checkBST(Node root, int min, int max) {
		if (root == null)
			return true;
		if (root.data < min || root.data > max)
			return false;
		return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
	}

	public static void main(String[] args) {
		Node root = new Node(4);

		Node left1 = new Node(2);

		Node right1 = new Node(6);

		root.left = left1;
		root.right = right1;
		

		
		Node left2=new Node(1);
		Node right2=new Node(3);
		left1.left=left2;
		left1.right=right2;
		
		Node left3=new Node(5);
		Node right3=new Node(7);
		right1.left=left3;
		right1.right=right3;
		

		System.out.println(checkBST(root));

	}
}

class Node {
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
	}
}