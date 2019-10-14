package sorting;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 5, 4, 7, 9 };
		sort(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

	public static void sort(int[] arr) {
		for (int cnt = 0; cnt < arr.length-1; cnt++) {
			int min = cnt;
			for (int j = cnt + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[cnt];
			arr[cnt] = temp;
		}
	}

}
