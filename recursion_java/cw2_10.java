/*
 Write a recursive function called reverseDigits that 
 takes an integer n as an 
 argument and prints the digits of n in reverse order.
 */
import java.util.Scanner;
public class cw2_10 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("input: ");
        int n = sc.nextInt ();
        reverseDigits(n);
        sc.close ();
    }

    public static void reverseDigits(int n) {
      
        if (n < 10) {
            System.out.println(n);
        } else {
            System.out.println(n % 10); 
            reverseDigits(n / 10);    
        }
        
    }
}
