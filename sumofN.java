import java.util.*;
public class sumofNnaturals {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter any number = ");
        int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        sum=sum+i;
    }   
    System.out.print("sum is = ");
    System.out.println(sum);
    }
}
