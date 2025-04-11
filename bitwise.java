//Bitwise operators use
import java.util.*;
public class bitwise{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente two no.:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int c=a&b;
        System.out.println("result is="+c);
        int d=a|b;
        System.out.println("result is"+d);
        int e=a^b;
        System.out.println("result is="+e);
    }
}