import java.util.*;
public class avgfunction {
    public static float avg(float a, float b, float c) {
        float w=((a + b + c) / 3);
        return w;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers :");
        float z = sc.nextFloat();
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float w=avg(x, y, z);
System.out.println("Average is ="+w);
    }
}






