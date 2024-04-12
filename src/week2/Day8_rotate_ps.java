package week2;

public class Day8_rotate_ps {

	static int[] arr = { 4, 5, 6, 7 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 0; j < 2; j++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
		}

		for (int a : arr) {
			System.out.println(a);
		}

	}

}