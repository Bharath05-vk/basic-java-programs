import java.util.*;
class interest{
public static void main(String[] a){
Scanner sc= new Scanner(System.in);
System.out.print("Enter the principal amount:");
int p=sc.nextInt();
System.out.print("Enter the year:");
int n=sc.nextInt();
System.out.print("Enter the rate of interest:");
int r=sc.nextInt();
int simple_interest=(p*n*r)/100;
System.out.print("Simple interest is:"+simple_interest);
}
}
