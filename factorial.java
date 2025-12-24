import java.util.*;
class factorial{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int num=sc.nextInt();
int temp=num;
int fact=0;
for(int i=num-1;i>=1;i--)
{
fact=temp*i;
temp=fact;

}
System.out.println("the factorial of the given number is: "+fact);
}
}