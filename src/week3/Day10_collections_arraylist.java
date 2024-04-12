package week3;

import java.util.ArrayList;

public class Day10_collections_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();

//		add
		al.add(4);
		al.add(8);
		al.add(1);
		al.add(3);
		al.add(1);
		al.add(0, 7);
		System.out.println("adding element-> " + al);

//		get element
		System.out.println("get-> " + al.get(1));

//		update element
		al.set(0, 25);
		System.out.println("update-> " + al);

//		size
		System.out.println("size-> " + al.size());

//		remove
//		al.remove(1);
//		System.out.println("remove-> " + al);

//		clear
//		al.clear();
//		System.out.println("clear-> " + al);

//		additional methods
//		contains
		System.out.println(al.contains(8));

//		lamda expression (removeIf)
		al.removeIf(e -> e > 4);
		System.out.println("removeIf-> " + al);

//		addAll (it add all elements from another)
		al1.addAll(al);
		System.out.println("addAll-> " + al1);

//		empty (it check wheather the array is empty or not)
		System.out.println("empty-> " + al.isEmpty());

//		indexOf (to find index)
		System.out.println("indexOf-> " + al.indexOf(3));

		System.out.println("lastIndexOf-> " + al.lastIndexOf(1));

	}

}