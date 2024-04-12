package week2;

class mano extends Exception {
	public mano(String s) {
		super(s);
	}
}

public class Day7_manual_exception_with_trycatch {

	static int[] arr = { 3, 2, 1, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			if (5 > 4) {
				throw new mano("error checking");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally { // (finally) if it given it print as default when it comes error or not
			System.out.println("hello");
		}

		System.out.println("java");

	}

}