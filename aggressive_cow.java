package sorting;

import java.util.*;
public class aggressive_cow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int nos=s.nextInt();
		int noc=s.nextInt();
		int[] arr=new int[nos];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		cow(arr,nos,noc);

	}
	public static void cow(int[] arr,int nos,int noc)
	{
		Arrays.sort(arr);
		int lo=0;
		int hi=arr[arr.length-1]-arr[0];
		int ans=0;
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;
			if(isPossible(arr,mid,noc))
			{
				ans=mid;
				lo=mid+1;
			}
			else
			{
				hi=mid-1;
			}
			
		}
		System.out.println(ans);
	}
	public static boolean isPossible(int[] arr,int mid,int noc)
	{
		int cows_placed=1;
		int cows_current=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]-cows_current>=mid)
			{
				cows_placed++;
				cows_current=arr[i];	
			}
			if(cows_placed==noc)
			{
				return true;
			}
		}
		return false;
	}
}
