//Make a function to check if a given number n is even or not.
import java.util.*;
public class evenfunction {
    public static int iseven(int x){
        if(x%2==0){
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    int n;
    n=sc.nextInt();
    if(iseven(n)==0){
        System.out.println("Number entered is even");
    }
    else{
    System.out.println("Number entered is odd");
    }
}
}
