package week2;

public class Day9_generic {
	int[] arr = { 1, 2, 3, 4 };
	int yetToJump;

	public static <T> void getMethog(T a) {
		if (a instanceof Boolean) {
			System.out.println("boolean-> " + a);
		} else {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("generic method:-");
		System.out.println("");

		getMethog(4);
		getMethog(true);
		getMethog('m');
		getMethog("java");
		getMethog(20.01);

	}

}