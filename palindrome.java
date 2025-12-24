import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int num=obj.nextInt();
        int temp=num;
        int rev=1,digit=0;
        while(num>0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("given no is palindrome");
        }
        else{
            System.out.println("given no is not palindrome");
        }
    }
}