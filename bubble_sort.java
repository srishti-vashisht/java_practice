
public class bubble_sort2 {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 4, 7, 9 };
		sort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void sort(int[] arr) {
		for (int cnt = 0; cnt < arr.length - 1; cnt++) {
			int flag = 0;
			for (int j = 0; j < arr.length - 1 - cnt; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}

	}
}
