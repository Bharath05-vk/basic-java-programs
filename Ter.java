import java.util.*;
class Ter{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the time taken of worker: ");
double time=sc.nextDouble();
String res= (time<2)? "invalid input":
(time>2 && time<=3)? "highly efficient":
(time>3 && time<=4)? "ordered to improve speed":
(time>4 && time<=5)? "given training to improve his speed":
 "leave the company";
System.out.println(res);
}
}