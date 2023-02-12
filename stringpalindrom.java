import java.util.*;
import java.io.*;
public class stringpalindrom
{
public static void main(String[]args)
{
String str2="";
Scanner sc=new Scanner(System.in);
System.out.println("enter any string =");
String str=sc.nextLine();
for(int i=str.length()-1;i>=0;i--)
{
str2=str2+str.charAt(i);
System.out.println(str2);
}
if(str==str2)
{
System.out.println("palindrom string");
}
else
{
System.out.println("not palindrom string");
}
}
}
