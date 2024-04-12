package week3;

public class Day10_jumping_ps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4, 6 };

		int maxIndex = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxIndex) {
				System.out.println("unable to jump");
				break;
			}
			maxIndex -= arr[i];

			if (maxIndex == 0) {
				System.out.println("able to jump");
				break;
			} else if (arr[i] < 0) {
				System.out.println("unable");
				break;
			}
		}

	}

}