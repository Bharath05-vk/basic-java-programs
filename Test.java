import java.util.*;
class Test{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the time taken of worker: ");
double time=sc.nextDouble();
if(time<2)
{
System.out.println("time is invalid");
}
else if(time>2 && time<=3)
{
System.out.println("highly efficient");
}
else if(time>3 && time<=4)
{
System.out.println("ordered to improve speed");
}
else if(time>4 && time<=5)
{
System.out.println("given training to improve his speed");
}
else
{
System.out.println("leave the company");
}
}
}