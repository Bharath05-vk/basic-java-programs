import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        
        int num = 500345465454;
        if ((num & 1) != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
