package hackerblocks4;

import java.util.Scanner;

public class rain_water_trapping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			rainwater(arr);
		}
	}

	public static void rainwater(int[] arr) {

		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];
			for (int j = i; j >= 0; j--) {
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			left[i] = max;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			int max = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			right[i] = max;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Math.min(left[i], right[i]) - arr[i];
		}
		System.out.println(sum);
	}
}
