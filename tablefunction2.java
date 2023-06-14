
//Make a function to print the table of a given number n.
//Print in function itself.
import java.util.*;

public class tablefunction2 {
    public static int table(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(x + "*" + i + "=");
            System.out.println(x * i);
        }
        return 0; // If we do not want to return anything we print return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n;
        n = sc.nextInt();
        table(n);
    }
}
