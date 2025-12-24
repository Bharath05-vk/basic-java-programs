import java.util.*;

public class OddEven3 {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner a=new Scanner(System.in);
        int num =a.nextInt();
        if ((num^1) ) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}