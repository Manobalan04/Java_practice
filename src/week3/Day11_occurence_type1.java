package week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day11_occurence_type1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<>();
		li.add(15);
		li.add(16);
		li.add(17);
		li.add(17);
		li.add(15);
		li.add(17);

		Map<Integer, Integer> countedWords = new HashMap<Integer, Integer>();
		int count = 1;

		for (int i = 0; i < li.size(); i++) {
			count = 1;

//			if (countedWords.containsKey(li.get(i))) { //assign to skip if same value already in arr 
//				continue;
//			}

			// (or)

			if (!countedWords.containsKey(li.get(i))) { // assign to skip if same value already in arr

				for (int j = i + 1; j < li.size(); j++) {

					if (li.get(i) == li.get(j)) {
						count++;
					}
				}
				countedWords.put(li.get(i), count);
			}
		}
		System.out.println(countedWords);

	}

}