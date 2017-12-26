package com.me.crack.others;


public class LCABST {
	public static void main(String[] args) throws Exception {

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

		System.out.println(findLCA(root, 2, 1));

	}

	private static int findLCA(Node node, int n1, int n2) throws Exception {
		if (node.data > n1 && node.data > n2) {
			return findLCA(node.left, n1, n2);
		} else if (node.data < n1 && node.data < n2) {
			return findLCA(node.right, n1, n2);
		}
		return node.data;
	}
}