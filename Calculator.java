import java.util.*;
class Calculator{
public static void main(String[] a){
Scanner sc =new Scanner(System.in);
System.out.print("enter the n value: ");
int n=sc.nextInt();
System.out.print("enter the num1: ");
int num1=sc.nextInt();
System.out.print("enter the num2: ");
int num2=sc.nextInt();
switch(n){
case 1:
System.out.println(num1+num2);
break;
case 2:
System.out.println(num1-num2);
break;
case 3:
System.out.println(num1*num2);
break;
case 4:
System.out.println(num1/num2);
break;
case 5:
System.out.println(num1%num2);
break;
default:
System.out.println("Enter valid n value");
}
}
}



