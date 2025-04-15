//Checking power of 2 using bit manipulation


                            
import java.util.*;

public class Main
{
    public static boolean isPowerOfTwo(int n) {
        
        if (n <= 0) {
            return false;
        }
        
        int result = n & (n - 1);
        
        if (result == 0) {
            return true;
        } 
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        boolean isPower = isPowerOfTwo(n);
        
        System.out.println("Number: " + n);
        if (isPower)
         {
            System.out.println("It is a power of 2.");
        }
        else
    System.out.println("not");
}
}
