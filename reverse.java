import java.util.*;

class Reverse{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=obj.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("reverse of a number is: "+rev);
    }
}