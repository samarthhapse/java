import java.util.*;
public class pattenr7 {
    public static void main(String args[]){

       //print numbers in down half pyramid of numbers
        int n=5;
        int m=5;
        for(int i=1;i<=5;i++){
            for(int j=m+1-i;j>=1;j--){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
}
