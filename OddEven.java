import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner a=new Scanner(System.in);
        int num =a.nextInt();
        if ((num%2 & 1)) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
