package com.yash.arrayprogram;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		System.out.println("Enter array ele");
		int inputArray[]=new int[size];
		for(int i=0;i<size;i++)
		{
		  inputArray[i]=sc.nextInt();
		}
				for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(inputArray[i]==inputArray[j]) {
	                    System.out.println("Duplicates Elements Are :" + inputArray[i]);
	                    inputArray[j] = inputArray[size - 1];
	                    size--;
	                }
			}
		}
		
		System.out.println("New Array Without Repeatations");
        for(int i = 0; i < size; i++)
        {
            System.out.println(inputArray[i]);
        }
		
		
	
		

	}

}
