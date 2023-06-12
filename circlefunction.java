//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class circlefunction {
    public static float circumference(float x){
        return 2*3.14F*x;
    }
public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius :");
    int r=sc.nextInt();
    System.out.println("Circumference of circle is "+circumference(r));
}
}
