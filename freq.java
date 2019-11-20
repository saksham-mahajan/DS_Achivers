import java.util.Scanner;

public class ArrayFrequency {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int freq[]=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			freq[i]=-1;
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					freq[j]=0;
				}
			}
			if(freq[i]!=0)
			{
				freq[i]=count;
			}
			}
			for(int i=0;i<n;i++)
			{
				if(freq[i]!=0)
			System.out.println(a[i]+" occurs "+freq[i]+" times");
			}
		}
	}
