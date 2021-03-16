package javaPractice;

import java.util.Scanner;

public class evenOdd
{
	
	public static void main (String[]args)
	  {
		int num;
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    if ( num % 2 == 0 )
	        System.out.println("even");
	     else
	        System.out.println("odd");
	  }
	/*public static void main (String[]args)
	  {
		int num = 99; 
        if ((num ^ 1) == num + 1) 
        { 
            System.out.println("Number is Even"); 
        } 
        else 
        { 
            System.out.println("Number is Odd"); 
        } 	
	  }*/
	/*public static void main (String[]args)
	  {
		int n = 100; 
        // if n|1 if greater than n then this number is even 
        if ((n | 1) > n)
        { 
            System.out.println("Number is Even"); 
        } 
        else 
        { 
            System.out.println("Number is Odd"); 
        } 
	  }*/
	
	/*public static void main (String[]args)
	  {
		int n = 100; 
        // if n&1 if greater than n then this number is even 
		if ((n & 1) == 1) 
		{ 
            System.out.println("Number is Odd"); 
        } 
        else 
        { 
            System.out.println("Number is Even"); 
        }  
	  }*/
}
