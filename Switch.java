import java.util.*;

public class Switch {
    public static void main(String[] args) {
        System.out.println("enter your Days");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        switch (days) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("You hav entered wrong input");
        }
    }
}
