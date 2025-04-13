
import java.util.Scanner;

public class oddeven {
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int k=n/2;
    if(k*2 == n){
        System.out.println("Odd");
    }else{
        System.out.println("Even");
    }
    }
}
