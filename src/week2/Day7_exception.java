package week2;

public class Day7_exception {

	static int[] arr = { 3, 2, 1, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			for (int i = 0; i < 7; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally { // (finally) if it given it print as default when it comes error or not
			System.out.println("hello");
		}

		System.out.println("java");

	}

}