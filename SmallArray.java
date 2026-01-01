import java.util.*;
class SmallArray{
public static void main(String[] a){
int arr[]={14,15,90,4,505};
for(int i=1;i<arr.length;i++)
{
if(arr[0]>arr[i])
{
arr[0]=arr[i];
}
}
System.out.println(arr[0]);
}
}