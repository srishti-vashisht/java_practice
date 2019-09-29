package lecture_12;
public class coint_toss {
	public static void main(String[] args) {
		toss(3, "");
	}
	public static void toss(int t, String ans) {
		if (t == 0) {
			System.out.println(ans);
			return;
		}
		if (t - 1 >= 0) {
			toss(t - 1, ans + "T");
		}
		if (t - 1 >= 0) {
			toss(t - 1, ans + "H");
		}
	}
}
