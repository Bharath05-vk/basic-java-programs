import java.util.*;
class Arith{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.print("enter the num1:");
int num1=sc.nextInt();
System.out.print("enter the num2:");
int num2=sc.nextInt();
int c,d,e,f;
c=num1+num2;
d=num1-num2;
e=num1*num2;
f=num1/num2;
System.out.println("add:"+c+"  "+"sub:"+d+"  "+"mul:"+e+"  "+"div:"+f);
}
}
