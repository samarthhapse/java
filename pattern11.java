import java.util.*;
public class patten11 {
    public static void main(String args[]){
    int number=1;
       //print natural numbers in half pyramid of numbers
        int n=5;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
           if((i+j)%2==0){
            System.out.print("1");
           }
        else{
            System.out.print("0");
        }
           }
        System.out.println();
       }
    }
}
