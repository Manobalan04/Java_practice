package week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Day12_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("iterator:-");
		System.out.println("");

//		list for saving values
		List<Integer> li = new ArrayList<>();
		li.add(12);
		li.add(46);
		li.add(23);
		li.add(4);

//		iterator -(for each,for loop)
		Iterator<Integer> it = li.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}