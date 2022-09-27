package com.yash.arrayprogram;

/*WAP to find third minimum number from list of numbers*/
import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elemnts");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		int temp;
		int count=0;
		int n=a.length;
	     for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(a[j-1] > a[j]){  
                             //swap elements  
                             temp = a[j-1];  
                             a[j-1] = a[j];  
                             a[j] = temp;  
                     }  
                      
             }  
     } 
	     System.out.println("Array After Bubble Sort");  
         for(int i=0; i < n; i++){  
                 System.out.print(a[i] + " ");  
         }  

		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			
		}
		int i;
		for( i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		System.out.println("third minimum number :"+a[2]);
	}

}
