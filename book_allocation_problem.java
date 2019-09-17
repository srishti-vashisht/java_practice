package sorting;

import java.util.Scanner;

public class book_allocation_problem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int nob = s.nextInt();
			int nos = s.nextInt();
			int[] books = new int[nob];
			for (int i = 0; i < nob; i++) {
				books[i] = s.nextInt();
			}
			allocation(books, nos);
		}
	}

	public static void allocation(int[] books, int nos) {
		int lo = books[0];
		int hi = 0;
		for (int pages : books) {
			hi += pages;
		}
		hi = hi - lo;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isPossible(books, mid, nos)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(ans);
	}

	public static boolean isPossible(int[] books, int mid, int nos) {
		int st = 1;
		int no_of_pages = 0;
		int curr_book = 0;
		while (curr_book < books.length) {
			if (no_of_pages + books[curr_book] <= mid) {
				no_of_pages += books[curr_book];
				curr_book++;
			} else {
				st++;
				no_of_pages = 0;
				if (st > nos) {
					return false;
				}
			}
		}
		return true;
	}
}
