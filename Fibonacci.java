import java.util.*;
class Fibonacci{
public static void main(String[] ar){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int fib=0;
int a=0;
int b=1;

for(int i=0;i<=num;i++)
{
fib=a+b;
System.out.println("Fibonacci series: "+fib);
a=b;
b=fib;
}
}
}
