import java.util.*;

class sum{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int num=obj.nextInt();
        int temp=num;
        int sum=0;
        while(num!=0)
        {
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("sum of the digits:"+sum);
    }
}