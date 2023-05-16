import java.util.*;
public class productfunction{
     public static int calculateproduct(int x,int y) {
        int pro=x*y;
        return pro;
    }
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=calculateproduct(a,b);
        System.out.println("multiplication is = " +mul);
    }
}