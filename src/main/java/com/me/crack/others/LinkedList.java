package com.me.crack.others;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LinkedList {
	public static void main(String[] args) {
		LNode head = new LNode(10);
		LNode l1 = new LNode(11);
		LNode l2 = new LNode(10);
		LNode l3 = new LNode(12);

		LNode l4 = new LNode(13);

		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		LNode node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		remove(11, head);
		node = head;
		System.out.println("After remove");
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		
		LinkedHashSet<String> lll;
		java.util.LinkedList<String> lll1;
		HashMap<String,String> lll2;
	}

	private static void remove(int data, LNode head) {
		LNode node = head;
		LNode prev = null;
		while (node.next != null) {
			if (node.data == data) {
				if (prev != null)
					prev.next = node.next;
				break;
			} else {
				prev = node;
				node = node.next;
			}
		}
	}
}

class LNode {
	int data;
	LNode next;

	public LNode(int data) {
		this.data = data;
	}
}
