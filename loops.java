
public class loops {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };
        // while (count <= 10) {
        // System.out.println("count is : " + count);
        // count++;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // if (i > 5) {
        // break;
        // }
        // System.out.println(" arr is " + arr[i]);
        // }

        // int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // for (int i : numbers) {
        // if (i > 5) {
        // break;
        // }
        // System.out.println("numbers is : " + i);
        // }

        // int[] arr = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
        // int index = 0;
        // int target = 12;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == target) {
        // index = i;
        // break;
        // }

        // }
        // System.out.println(index);
        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            // if (i == 3) {
            // continue;
            // }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println("");

        }

    }
}
