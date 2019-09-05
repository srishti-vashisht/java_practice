 package hackerblocks;
import java.util.Scanner;
public class inc_dec_series {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int sum=Integer.MAX_VALUE;
		while(t>0)
		{
			int a=s.nextInt();
			if(a<sum)
			{
				sum=a;
				t--;
			}
			else
			{
				sum=a;
				t--;
				break;
			}
		}
		while(t>0)
		{
			int a=s.nextInt();
			if(sum<a)
			{
				sum=a;
				t--;
			}
			else
			{
				break;
			}
		}
		if(t==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
