import java.util.*;
public class gcdfunction {
    static int x;
    static int y;
    static int ans;
    public static int moj(int a,int b){
    if(x>y){
        for(int i=y;i>2;i--){
            if(x%i==0 && y%i==0){
              ans=i;
              break;
            }
        }
    }
    else{
        int temp=x;
        x=y;
        y=temp;
        moj(x,y);
    }
    return ans;
   }
    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter x");
     x=sc.nextInt(); 
            System.out.println("Enter y");
     y=sc.nextInt();
System.out.println("gcd is = "+moj(x,y));
    }
}

