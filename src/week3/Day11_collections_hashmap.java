package week3;

import java.util.HashMap;
import java.util.Map;

public class Day11_collections_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		hashmap can use as anyone as follows

//		HashMap<String, Integer> hm1=new HashMap<String, Integer>(); 
		Map<String, Integer> hm = new HashMap<>();

//		put
		hm.put("mano", 23);
		hm.put("date", 04);

		hm.put(null, 04);
		hm.put(null, 01); // this updated as null

		hm.put("emp1", null);
		hm.put("emp2", null);

		System.out.println(hm);

//		get
		System.out.println(hm.get("date"));

//		entryset (conversion from paranthesis to array) to iterate(loop)
		System.out.println(hm.entrySet());

		hm.entrySet().forEach(e -> {
			System.out.println(e.getValue());
		});

		hm.entrySet().forEach(e -> {
			if (null != e.getValue() && e.getValue() == 4) {
				System.out.println(e.getKey());
			}
		});

	}

}