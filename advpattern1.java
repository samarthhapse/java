import java.util.*;
public class advpattern1 {
    public static void main(String args[]){
        // BUTTERFLY PATTERN
        // ........first half..........

        int n=5;
        for(int i=1;i<=n;i++){
        // first part
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        // spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
    
        // second part
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
        //.......second half..........

        for(int i=n;i>=1;i--){
        // first part
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        // spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        // second part
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
}
    }
}

