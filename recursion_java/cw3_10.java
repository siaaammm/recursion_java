/*
 Write a recursive function called sumDigits that 
 takes an integer n as an argument and sums up the 
 digits of n then returns the result.
 */

import java.util.Scanner;
public class cw3_10 {
  
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("input: ");
      int n = sc.nextInt (); 
      int sum = sumDigits(n);
      System.out.println("The sum of digits of " + n + " is: " + sum);
      sc.close ();
    }
    
    public static int sumDigits(int n) {
      
      if (n < 10) {
        return n;
      } else {
        return n % 10 + sumDigits(n / 10); 
      }
      
    }
  }
  