
//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class sumofodd {
  public static int addodd(int x){
    int sum=0;
  for(int i=1;i<=x;i=i+2){
    sum=sum+i;
    }
    return sum;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n = ");
    int n=sc.nextInt();
    System.out.println("sum of odd number till "+n+" is = "+addodd(n));
  }
}
