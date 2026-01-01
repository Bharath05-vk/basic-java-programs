import java.util.*;
class Angle{
public static void main(String[] ar){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the angles of triangle: ");
System.out.print("Enter the angle 1: ");
int a=sc.nextInt();
System.out.print("Enter the angle 2: ");
int b=sc.nextInt();
System.out.print("Enter the angle 3: ");
int c=sc.nextInt();
if(a<90 && b<90 && c<90 && (a + b + c == 180))
{
System.out.println("Acute angled triangle");
}
else if(a==90 || b==90 || c==90 && (a + b + c == 180))
{
System.out.println("right angled triangle");
}
else if(a>90 || b>90 || c>90 && (a + b + c == 180))
{
System.out.println("obtuse angled triangle");
}
else
{
System.out.println("triangle not possible");
}
}
}
