//Maximum of two no. without if-else or ternary operator
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter two No.s:"); 
        int a =sc.nextInt();
        int b = sc.nextInt();

        int max = (a + b + Math.abs(a - b)) / 2;

        System.out.println("Maximum number is: " + max);
    }
}
