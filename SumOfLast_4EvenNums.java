package primeNum_and_Summations;

import java.util.Scanner;

public class SumOfLast_4EvenNums 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		int count = 0;
		int sum = 0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2==0)
			{
				count++;
				sum += arr[i];
			}
			if(count==4)
				break;
		}
		System.out.println("Sum Of Last 4 Even Numbers "+ sum);
	}
}
