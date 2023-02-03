package practice;

import java.util.Scanner;

public class PrimeFromRange {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start=s.nextInt();
		System.out.println("Enter last Number");
		int end=s.nextInt();
		int noOfPrimes=0;
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				noOfPrimes++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("The no of Prime numbers between "+start+" and "+end+" : "+noOfPrimes);

	}

}

