//Swwap using bitwise
import java.util.*;
public class swap {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente two no.:");
        int a=sc.nextInt();
        int b=sc.nextInt();

       a=a^b;
       b=a^b;
       a=a^b;
       System.out.println("After swap="+a+b);
    }
}

