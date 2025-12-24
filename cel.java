import java.util.*;
class Cel{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.print("enter the celcius:");
int celcius=sc.nextInt();
int fahrenheit=(celcius*9/5)+32;
System.out.println("the Fahrenheit value of given celcius is:"+fahrenheit);
}
}
