import java.util.*;
class Tables{
public static void main(String[] aargs){
Scanner sc =new Scanner(System.in);
System.out.print("Enter the table: ");
int num=sc.nextInt();
int tab;
for(int i=1;i<=10;i++)
{
tab=num*i;
System.out.println(num +" * "+ i +" = "+tab);
}
}
} 