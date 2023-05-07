//BONUS
//Qs. Print if a number is prime or not (Input n from the user). 
//[In this problem you will learn how to check if a number is prime or not]
import java.util.*;
public class hw2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int flag=0;
        System.out.print("Enter any number = ");
int n=sc.nextInt();
for(int i=2;i<n;i++){
    if(n%i==0){
       flag=1;
    }
   }
   if(flag==1){
    System.out.println("not prime");
   }
   else{
    System.out.println("prime");
   }   
}
}
        