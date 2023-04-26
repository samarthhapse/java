import java.util.*;
//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
//using float
public class hw1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the radius of circle");
    int r= sc.nextInt();
    //using float
    float area = (3.14F*r*r);
    System.out.println(area);
    }
}
