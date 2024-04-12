package week3;

public class Day11_occurence_type2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 4, 5, 7, 1, 4, 5, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}

	}

}