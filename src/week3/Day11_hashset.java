package week3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day11_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s = new HashSet<>();

		s.add(14);
		s.add(77);
		s.add(14);

		System.out.println(s);

		List<Integer> li = new ArrayList<>(s);
		System.out.println(li);

		System.out.println(li.get(1));

	}

}