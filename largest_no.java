//largest no. using given digits
//
//
package hackerblocks;
import java.util.*;
public class Max_no_using_give_nos {
	public static void main(String[] args) {
		int n=24319;
		int temp=n;
		int count=0;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		temp=n;
		int[] arr=new int[count];
		int i=0;
		while(temp>0)
		{
			arr[i++]=temp%10;
			temp/=10;
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		for(i=arr.length-1;i>=0;i--)
		{
			temp=temp+arr[i]*(int)(Math.pow(10,count-1));
			count--;
		}
		System.out.println(temp);
	}
}
