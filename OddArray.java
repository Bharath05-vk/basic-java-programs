import java.util.*;
class OddArray{
public static void main(String[] a){
int arr[]={14,15,90,4,505};
int count_odd=0;
int count_even=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2 == 0)
{
count_even++;
}
else
{
count_odd++;
}
}
System.out.println("even no count is: "+ count_even + " , " + "odd no count is: " + count_odd);
}
}