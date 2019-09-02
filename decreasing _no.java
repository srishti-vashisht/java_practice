package lecture_5;
import java.util.Scanner;
public class just_larger {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int flag=0;
		int count=0;
		int t=Integer.MIN_VALUE;
		while(temp>0)
		{
			int rem=temp%10;
			if(rem>t)
			{
				t=rem;
				flag++;
			}
			count++;
      temp/=10;
		}
		if(count==flag)
		{
			System.out.println("descending order");
		}
		else
		{
			System.out.println("not descending order");
		}
	}
}
