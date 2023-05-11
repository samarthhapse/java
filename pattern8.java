import java.util.*;
public class pattern8 {
    public static void main(String args[]){
  //print numbers in down half pyramid of numbers
        int n=5;
        int m=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=m+1-i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
}
