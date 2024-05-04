/*
Write a function called recursiveSum to sum 
till N recursively.
 */

 import java.util.Scanner;
 public class cw1C_10 {
   
   public static int recursiveSum (int sum) {
     
     if (sum==1) {
       return 1;
     } else {
       return sum + recursiveSum (sum-1);
     }
     
   }
   
   public static void main (String [] args) {
     
     Scanner sc = new Scanner (System.in);
     System.out.print ("N = ");
     int N = sc.nextInt ();
     recursiveSum (N);
     System.out.print (recursiveSum (N));
     sc.close();
   }
 }
 
  