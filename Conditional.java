import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 90 && a <= 100) {
            System.out.println("Grade A");
        } else if (a >= 50 && a < 90) {
            System.out.println("Grade B");

        } else if (a >= 30 && a < 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("you are fail");
        }
    }
}
