import java.util.*;

public class switchcase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = sc.nextInt();
        System.out.print("Enter b ");
        int b = sc.nextInt();
        System.out.println("press 1 to add , 2 to substract , 3 to mul , 4 to div , 5 to to rem");
        int n = sc.nextInt();
switch(n){
    case 1:System.out.println(a+b);
    break;
    case 2:System.out.println(a-b);
    break;
    case 3:System.out.println(a*b);
    break;
    case 4:if(b==0){
        System.out.println("Invalid");
    }
    else{
        System.out.println(a/b);
         }
    break;
    case 5:
    if(b==0){
        System.out.println("Invalid");
    }else{
        System.out.println(a%b);
      }
       break;
    default:System.out.println(" Enter correct number. ");
}
    } 
    
}
