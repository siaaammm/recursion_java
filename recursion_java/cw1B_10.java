/*
 Write a function nToOne that prints 
 from N to 1 recursively.
 */

 import java.util.Scanner;
 public class cw1B_10 {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.print("N = ");
         int N = sc.nextInt ();
         oneToN(1,N);
         sc.close();
     }
 
     public static void oneToN (int st, int n) {
         if (st > n) {
             return;
         }
         System.out.print(n + " ");
         oneToN (st, n-1);
     }
 }
 