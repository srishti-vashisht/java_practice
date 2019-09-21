package recursion;

public class log_n_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(log(100));
	}
	public static int log(int n)
	{
		return (n>1)?1+log(n/10):0;
	}
}
