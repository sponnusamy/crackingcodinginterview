package com.me.crack.others;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
		
		BFS1(root);
	}

	private static void BFS1(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.println(n.data);
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
		}
	}
}
