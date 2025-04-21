import java.util.*;
public class weekdays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number(1-7) ");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.println(" 'MONDAY'1St day of week  ");
            break;
            case 2:System.out.println("'TUESDAY' 2nd day of week");
            break;
            
            case 3:System.out.println("'WEDNESDAY' 3rd day of week");
            break;
            case 4:System.out.println("'THURSDAY' 4th day of week");
            break;
            case 5:System.out.println("'FRIDAY' 5th day of week");
            break;
            case 6:System.out.println("'SATURDAY' 6th day of week");
            break;
            case 7:System.out.println("'SUNDAY' 7th day of week");
            break;
            default:System.out.println("Invalid Input");
        }

    }
}
