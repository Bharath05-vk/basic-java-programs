import java.util.*;
class Vowel{
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the word: ");
String word=sc.nextLine();
for(int i=0;i<=word.length();i++)
{
char ch=Character.toLowerCase(word.charAt(i));
if((ch>='a')&&(ch<='z'))
{
switch(ch){
case 'a':
case 'e':
case 'i': 
case 'o':
case 'u':
System.out.println("vowel");
break;
default:
System.out.println("consonant");
}
}
}
}
}