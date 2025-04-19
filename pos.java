import java.util.*;
public class pos-negcheck {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.");
    int n = sc.nextInt();
    if(n>0)
    System.out.println("No is positive");
    else if( n<0)
    System.out.println("No. is negative");
    else
    System.out.println("Invalid no.");

}
}