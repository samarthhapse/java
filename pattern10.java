import java.util.*;
public class pattern10 {
    public static void main(String args[]){
  //print numbers in down half pyramid of similar numbers
        int n=5;
        int m=5;
        for(int i=5;i>1;i--){
            for(int j=m;j>=m+1-i;j--){
            System.out.print(i);
        }
        System.out.println();
    }
    }
}
