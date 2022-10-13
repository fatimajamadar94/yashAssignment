package com.yash.question5;

public class array {
	
	  public static String getLongestStringAndNumber(String []array)
	    {
	         int maxLength = 0;
	          String longestStringLenght = null;
	          for (String s : array) {
	              if (s.length() > maxLength) {
	                  maxLength = s.length();
	                  longestStringLenght = s;
	              }
	          }
	          return longestStringLenght;



	   }



	   public static int getMaxNumber(int []arr) {
	        int max=0;
	        for(int i=0;i<arr.length;i++) {
	            if(max<arr[i]) {
	                max = arr[i];
	            }
	        }
	        return max;
	        
	    }
	    public static void main(String[] args)
	    {
	         String[] names = {"fatima","sabiha","priyad","asmita"};
	            String a = getLongestStringAndNumber(names);
	            System.out.println("name of maximum lenght String is: "+a+ " and length: "+a.length());
	            
	         int[] num = {23,54,2,5,67,6,77};
	           int maxNumber = getMaxNumber(num);
	           System.out.println("MAXIMUM NUMBER" + maxNumber);
	            
	    }
 

}
