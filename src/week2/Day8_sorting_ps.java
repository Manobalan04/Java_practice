package week2;

import java.util.Scanner;

public class Day8_sorting_ps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the array");
		int size = sc.nextInt();

		int[] arr = new int[size];

//		System.out.println("enter the elements to the array");
		for (int i = 0; i < size; i++) {
			System.out.println("enter the elements to the array " + (i + 1));
			int elements = sc.nextInt();
			arr[i] = elements;
		}

		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int a : arr) {
			System.out.println(a);
		}
	}
}

//another method
//
//int temp;
//for (int i = 0; i < size; i++) {
//	for (int j = 1; j < size; j++) {
//		if (i != j) {
//			if (arr[i] < arr[j]) {
//				temp = arr[j];
//				arr[j] = arr[i];
//				arr[i] = temp;
//			}
//		}
//	}
//}