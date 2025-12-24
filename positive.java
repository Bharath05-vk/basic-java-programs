import java.util.*;
class positive{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int num=sc.nextInt();
if(num>0)
{
System.out.print("positive");
}
else if(num<0)
{
System.out.print("negative");
}
else
{
System.out.print("zero");
}
}
}