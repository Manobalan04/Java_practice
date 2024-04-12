package week2;

public class Day7_primeno_ps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prime no:-");
		System.out.println("");

		int n = 50;

		boolean prime = true;
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
					prime = false;
					break;
				} else {
					prime = true;
					break;
				}

			}
			if (!prime) {
				System.out.println(i);
			}
		}

	}
}