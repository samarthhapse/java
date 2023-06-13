//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
public class votefunction {
    // if you want to return formt of true/false you need to use boolean type of function
    public static boolean canvote(int x){
        if(x>18){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
    int a=sc.nextInt();
    if(canvote(a)){
        System.out.println("You are eligible");
    }
    else{
    System.out.println("You are not eligible");
    }
}
}
