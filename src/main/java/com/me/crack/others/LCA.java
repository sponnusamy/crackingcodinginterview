package com.me.crack.others;

import java.util.ArrayList;
import java.util.List;

public class LCA {
	public static void main(String[] args) throws Exception {

		Node root = new Node(6);

		Node left1 = new Node(7);

		Node right1 = new Node(8);

		root.left = left1;
		root.right = right1;

		Node left2 = new Node(5);
		Node right2 = new Node(9);
		left1.left = left2;
		left1.right = right2;

		Node left3 = new Node(11);
		Node right3 = new Node(20);
		right1.left = left3;
		right1.right = right3;

		System.out.println(findLCA(root, 9, 11));

	}

	private static int findLCA(Node root, int n1, int n2) throws Exception {
		List<Integer> path1 = new ArrayList<>();
		List<Integer> path2 = new ArrayList<>();

		findPath(root, n1, path1);
		findPath(root, n2, path2);
		int i = path1.size() - 1;
		int j = path2.size() - 1;
		while (i >= 0 && j >= 0) {
			int k1 = path1.get(i);
			int k2 = path2.get(j);
			if (k1 == k2) {
				i--;
				j--;
			} else if (k1 != k2) {
				return path1.get(i + 1);
			}
		}

		return path1.get(i + 1);
	}

	private static boolean findPath(Node node, int n, List<Integer> path) {
		if (node == null) {
			return false;
		}
		if (node.data == n) {
			path.add(n);
			return true;
		}
		boolean r = findPath(node.left, n, path);
		if (r) {
			path.add(node.data);
			return true;
		} else {
			r = findPath(node.right, n, path);
			if (r) {
				path.add(node.data);
				return true;
			}
		}
		return false;
	}
}
