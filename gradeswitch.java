//Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
//If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//If they enter 0 then stop.
//If he/ she scores :
//Marks >=90 -> print “This is Good”
//89 >= Marks >= 60 -> print “This is also Good”
//59 >= Marks >= 0 -> print “This is Good as well”
//	Because marks don’t matter but our effort does.
//(Hint : use do-while loop but think & understand why)

//there may be another method....................

import java.util.*;
public class Hw1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 OR 1 = ");
int n = sc.nextInt();
System.out.print("Enter Marks = ");
switch(n){
    case 1:int m = sc.nextInt();
    while(m>=90){
        System.out.println("this is good");
        break;
    }
    while(89>=m && m>=60){
        System.out.println("this is also good");
        break;
    }
    while(m<=59 && m>=0){
        System.out.println("this is good as well");
        break;
    }
    break;
    case 0:System.out.println("Out !");
    break;
default:System.out.println("Marks don’t matter but our effort does");
}
}
}


