//usecase of ternary operator
import java.util.*;
public class ternary {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Ente two no.:");
    int a=sc.nextInt();
    int b=sc.nextInt();

    int x=((a>b)?a:b);
    System.out.println(x);
  }
}
