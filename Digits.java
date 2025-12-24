import java.util.*;
class Digits{
public static void main(String[] a){
int temp,count=0,rem;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int num=sc.nextInt();
temp=num;
while(num>0)
{
rem=num%10;
count++;
num=num/10;
}
System.out.println("the digit present in the given number is : "+count);
}
}