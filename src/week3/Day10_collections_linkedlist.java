package week3;

import java.util.LinkedList;

public class Day10_collections_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Linked list:-");

		LinkedList<Integer> Ll = new LinkedList<Integer>();
		Ll.add(16);
		Ll.addFirst(17);
		Ll.addLast(15);
		System.out.println(Ll);

		Ll.removeFirst();
		Ll.removeLast();
		System.out.println(Ll);
	}

}