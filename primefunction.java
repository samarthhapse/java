// Make a function to check if a number is prime or not
import java.util.*;

public class primefunction{
    public static int prime(int x){
        for(int i=2;i<x;i++){
        if(x%i==0){
        return 0;
        }
    }
    return 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int a = sc.nextInt();
        if(prime(a)==1){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}