
//Make a function to print the table of a given number n.
//Print in main function.

import java.util.*;

public class tablefunction {
    public static int table(int x, int i) {
        return x * i;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ny number");
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(table(n, i));
        }
    }
}
