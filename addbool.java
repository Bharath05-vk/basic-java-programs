import java.util.Scanner; 
class Add{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("Enter the num1 : ");
int num1=sc.nextInt();
System.out.print("Enter the num2 : ");
int num2=sc.nextInt();
int sum=num1|num2;
System.out.println("the sum of two no is : "+sum);
}}