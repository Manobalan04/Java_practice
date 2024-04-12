package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Day12_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(4);
		li.add(46);
		li.add(23);
		li.add(4);

//		map
		List<Integer> result = li.stream().map(e -> e + 5).collect(Collectors.toList());
		System.out.println("map-> " + result);

//		filter
		List<Integer> res = li.stream().filter(e -> e > 12).collect(Collectors.toList());
		List<Integer> rs1 = li.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println("filter-> " + res);
		System.out.println(rs1);

//		map,filter (combined)
		List<Integer> rs = li.stream().filter(e -> e > 12).map(e -> e + 5).collect(Collectors.toList());
		System.out.println(rs);

//		reduce
		Integer rd = li.stream().reduce(0, (a, b) -> a + b);
		System.out.println("reduce-> " + rd);

//		anymatch
		boolean ay = li.stream().anyMatch(e -> e > 24);
		System.out.println("anyMatch-> " + ay);

//		allmatch
		boolean all = li.stream().allMatch(e -> e > 23);
		System.out.println("allMatch-> " + all);

//		distinct (remove duplicate value)
		List<Integer> dist = li.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct-> " + dist);

//		findFirst
		Optional<Integer> ff = li.stream().filter(e -> e > 0).findFirst();
		System.out.println("findFirst-> " + ff);

//		findAny
		Optional<Integer> fa = li.stream().filter(e -> e > 23).findAny();
		System.out.println("findAny-> " + fa);

//		sort
		List<Integer> st = li.stream().sorted().collect(Collectors.toList());
		System.out.println("Sort-> " + st);

	}

}