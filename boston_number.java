package hackerblocks4;

import java.util.Scanner;

public class boston_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(boston(n));
		s.close();
	}

	public static int boston(int n) {
		int a = primeFactors(n);
		int b = sumdig(n);
		if (a == b) {
			return 1;
		}
		return 0;
	}

	public static int primeFactors(int n) {
		int sum = 0;
		while (n % 2 == 0) {
			sum += 2;
			n /= 2;
		}
		for (int i = 3; i < Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				sum += i;
				n /= i;
			}
		}
		if (n > 2) {
			sum += n;
		}
		return (cycliccount(sum));
	}

	public static int sumdig(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum + n % 10;
			n /= 10;
		}

		return cycliccount(sum);
	}

	public static int cycliccount(int a) {
		if (a == 0) {
			return 0;
		}
		return (a % 9 == 0) ? 9 : (a % 9);
	}
}
