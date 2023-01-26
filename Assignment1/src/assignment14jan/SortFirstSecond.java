package assignment14jan;

import java.util.Scanner;

public class SortFirstSecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int Size = sc.nextInt();
		int[] array = new int[Size];
		if (Size > 0) {
			System.out.println("Enter the elements:");
			for (int i = 0; i < Size; i++) {
				array[i] = sc.nextInt();
			}
			// sort first half of the array
			for (int i = 0; i <=Size / 2; i++) {
				for (int j = i + 1; j<=Size / 2; j++) {
					if (array[j] < array[i]) {
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
					}
				}
			}
			// sort second half of the array
			for (int i = Size / 2+1; i < Size; i++) {
				for (int j = i + 1; j < Size; j++) {
					if (array[j] > array[i]) {
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
					}
				}
			}
			// print the sorted array
			for (int i = 0; i < Size; i++) {
				System.out.println(array[i]);
			}
		} else {
			System.out.println("Array size should be greater than 0");
		}
	}
}