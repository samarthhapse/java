import java.util.*;
public class pattern5 {
    public static void main(String args[]){
        //initial half of puramid
        int n=5;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int k=m-i;k>=1;k--){  // for(int k=1;k<=m-i;k++){
               System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               System.out.print("*");
        }
        System.out.println();
        }
    }
}