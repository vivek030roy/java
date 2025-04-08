//Basic arithmetic operations//
import java.util.*;
public class Arithmetic
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter two no.:");
    int a=sc.nextInt();
    int b=sc.nextInt();

    int sum=a+b;
    System.out.println(sum);
    int diff=b-a;
    System.out.println(diff);
    int mul=a*b;
    System.out.println(mul);
    int div=a/b;
    System.out.println(div);
    int mod=a%b;
    System.out.println(mod);
}
}