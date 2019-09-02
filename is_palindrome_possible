package hackerblocks;
public class palindrome_or_not {
	public static void main(String[] args) {
		int a=1232144;
		int[] arr=new int[10];
		int count=0;
		int temp=a;
		while(temp>0)
		{
			int rem=temp%10;
			arr[rem]++;
			count++;
			temp/=10;
		}
		for(int val:arr)
		{
			System.out.println(val);
		}
		int count1=0;;
		
		if(count%2==0)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>0 && arr[i]%2==0)
				{
					count1=count1+arr[i];
				}
			}
			
			System.out.println(count);
			System.out.println(count1);
			if(count1==count)
			{
				System.out.println("palindrome possible");
			}
			else
			{
				System.out.println("not possible");
			}
		}
		else
		{
			int flag=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>0 && arr[i]%2==1)
				{
					flag++;
				}
				
				if(arr[i]>0 && (arr[i]%2==0||arr[i]%2==1 &&flag==1))
				{
					count1=count1+arr[i];
				}
			}
			System.out.println(count);
			System.out.println(count1);
			if(count1==count)
			{
				System.out.println("palindrome possible");
			}
			else
			{
				System.out.println("not possible");
			}
		}
}
}
