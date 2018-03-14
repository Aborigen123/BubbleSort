package Bubble.Sort;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();		
				
		int  r, n = 0;

		System.out.println("Enter the number of array elements:");

		n = sc.nextInt();

				int[] array = new int[n];
				
				System.out.println("Enter the number to which the range of random numbers will be added (by default from 0 to the number you lead)");
				r = sc.nextInt();
				
				System.out.println("Here is your array of" +n+ " array elements");
				
				for(int i = 0; i<n; i++){
					array[i] = rand.nextInt(r);
		 	
				System.out.println(array[i]);
			}
				System.out.println("Sorted");
				
				int[] a = BubbleSort(array);
				
				 for(int i = 0; i<a.length; i++){
					 System.out.println(a[i]);
				 }
	}
	
	
	public static int[] BubbleSort(int[] m)
	{
		int rep = 0;
		boolean Zam = true;
		while(Zam)
		{
			Zam=false;
			for (int i=0; i<m.length-1-rep; i++)
			{
				if (m[i]>m[i+1])
				{
					int tmp = m[i];
					m[i] = m[i+1];
					m[i+1] = tmp;
					Zam=true;
				}
			}
			rep++;
		}
		return m;
	
	}}
