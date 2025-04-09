
//Comparing two numbers//
import java.util.*;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no.");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.print("greatest is " + a);
        } else {
            System.out.println(" greates is " + b);
        }
    }
}
