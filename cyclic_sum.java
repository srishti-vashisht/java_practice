package java_lab;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,a=0;
		while(n>0 || sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.println(sum);
		s.close();
	}
}
