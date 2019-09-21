package recursion;

public class sum_of_series {

	public static void main(String[] args) {
		System.out.println(sum(3));
	}

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		int temp = (int) Math.pow(n, n);
		return temp + sum(n - 1);
	}

}

// 1**1+2**2+3**3+......
