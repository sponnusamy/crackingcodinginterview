package com.me.crack.others;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(4);

		Node left1 = new Node(2);

		Node right1 = new Node(6);

		root.left = left1;
		root.right = right1;

		Node left2 = new Node(1);
		Node right2 = new Node(3);
		left1.left = left2;
		left1.right = right2;

		 Node left3 = new Node(5);
		 Node right3 = new Node(7);
		 right1.left = left3;
		 right1.right = right3;

		System.out.println(checkBalncedBT(root));
	}

	private static boolean checkBalncedBT(Node root) {
		if(root == null)
			return true;
		int leftNodes = getN(root.left);
		int rightNodes = getN(root.right);
		if(leftNodes != rightNodes){
			return false;
		}
		return checkBalncedBT(root.left) && checkBalncedBT(root.right);
	}

	private static int getN(Node node) {
		if (node == null)
			return 0;
		return 1 + Math.max(getN(node.left), getN(node.right));
	}
}

