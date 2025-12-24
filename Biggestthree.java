import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scan.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scan.nextInt();

        System.out.print("Enter third number (c): ");
        int c = scan.nextInt();

        int max = (a > b) ? a : b;

       
        max = (max > c) ? max : c;

        System.out.println("The biggest number is: " + max);
    }
}