package practice;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter A Number");
		int num= s.nextInt();
		int sum=0;
		int temp=num;
		for(int i=num;num>0;num=num/10)
		{
			i=num%10;
			sum=sum+i*i*i;
		}
		if(temp==sum)
		{
			System.out.println("It is ArmStrong Number");
		}
		
	}

}
