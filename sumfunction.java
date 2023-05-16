import java.util.*;

public class sumfunction {
    public static int sum(int x,int y){
        int sum=x+y;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int added = sum(a,b);  //function call
       System.out.println("sum of 2 numbers is = " +added);  
    }

}

