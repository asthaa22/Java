package javaPractice;

import java.util.Scanner;

public class checkPrime 
{
	 public static void main(String[] args) {  
	       Scanner sc = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = sc.nextInt();  
	       if (isPrime(n)) 
	       {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	       }  
	   }  
	  
	   public static boolean isPrime(int n) {  
		   if (n==1) return false;
		   if (n==2 || n==3) return true;
		   if (n%2==0 || n%3==0) return false;
		   for (int i = 5; i*i<n ;i+=6){
		   	if (n%i==0 || n%(i+2)==0)
		   		return false;
		   }
		   return true; 
	       
	   } 
}
