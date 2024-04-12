package week3;

public class Day14_con_ps {

	static int[] arr = { 1, 1, 4, 5, 1, 1, 1, 1, 6, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int maxCount = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 1) {
				count++;

				if (count > maxCount) {
					maxCount = count;
				}

			} else {
				count = 0;
			}
		}
		System.out.println(maxCount);

	}

}