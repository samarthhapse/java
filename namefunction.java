import java.util.*;

public class namefunctions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String naam= sc.next();
        printMyName(naam);     //function call
    }
}

