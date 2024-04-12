package week3;

public class Day10_matrix_mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr0 = { { 1, 3 }, { 4, 5 } };
		int[][] arr1 = { { 1, 2 }, { 5, 7 } };

		int[][] result = new int[2][2];

//		i    j
//		1 2  1 3      1*1+2*5     1*3+2*7     11  17
//		4 5  5 7      4*1+5*5     4*3+5*7     29  47

		for (int i = 0; i < arr0.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				for (int k = 0; k < arr1.length; k++) {
					result[i][j] += arr0[i][k] * arr1[k][j];
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}

	}

}