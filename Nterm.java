import java.util.*;
class Nterm{
public static void main(String[] args ){
Scanner sc= new Scanner(System.in);
System.out.print("Enter the series count: ");
int num=sc.nextInt();
int a=0;
int b=0;

for(int i=0;i<num;i++)
{
if(i%2==0)
{
System.out.print(a +",");
a+=7;
}
else
{
System.out.print(b +",");
b+=6;
}
}
}
}