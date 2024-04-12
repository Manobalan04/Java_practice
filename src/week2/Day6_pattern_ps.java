package week2;

public class Day6_pattern_ps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("star pattern-");
		System.out.println("");

//		*
//		***
//		*****

		int count = 1;
		for (int i = 1; i < 4; i++) {

			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}
			count += 2; // count=count+2
			System.out.println();
		}

//*****
//***
//*
		System.out.println("");
//

		int countt = 5;
		for (int i = 1; i < 4; i++) {

			for (int j = countt; j > 0; j--) {
				System.out.print("*");
			}
			countt -= 2; // count=count-2
			System.out.println();
		}

	}

}