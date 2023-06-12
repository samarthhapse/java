//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class greater {
    public static int greatest(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a=sc.nextInt();     
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        System.out.println("Greatest number is : "+greatest(a,b));
    }
}
