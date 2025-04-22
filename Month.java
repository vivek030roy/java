import java.util.*;
public class Month {
    
//Program to print weekdays

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number(1-12) ");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:System.out.println(" 'JANUARY'1St Month of Year");
            break;
            case 2:System.out.println("'FEBRUARY' 2nd Month of Year");
            break;
            case 3:System.out.println("'MARCH' 3rd Month of Year");
            break;
            case 4:System.out.println("'APRIL' 4th Month of Year");
            break;
            case 5:System.out.println("'MAY' 5th Month of Year");
            break;
            case 6:System.out.println("'JUNE' 6th Month of Year");
            break;
            case 7:System.out.println("'JULY' 7th Month of Year");
            break;
            case 8:System.out.println("''AUGUST' 8th Month of Year");
            break;
            case 9:System.out.println("'SEPTEMBER' 9th Month of Year");
            break;
            case 10:System.out.println("'OCTOBER' 10th Month of Year");
            break;
            case 11:System.out.println("'NOVEMBER' 11TH Month of Year");
            break;
            case 12:System.out.println("'DECEMBER' 12th Month of Year");
            break;
            default:System.out.println("Invalid Input");
        }

    }
}


