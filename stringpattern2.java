import java.util.Scanner;
import java.io.*;
class stringpattern2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(str.charAt(j));
}
System.out.print("\n");
}
}
}