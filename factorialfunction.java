import java.util.*;
public class factorialfunction{
     public static int calculateproduct(int x) {
       
        int factorial=1;
        for(int i=x;i>=1;i--){
            factorial=factorial*i;
        }
        return factorial;
    }
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
       
        int fact=calculateproduct(a);
        System.out.println("factorial is = " +fact);
    }
}