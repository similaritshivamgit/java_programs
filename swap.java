import java.io.*;
import java.util.Scanner;
class swap
{
public static void main(String args[])throws IOException
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter first number =");
a = sc.nextInt();
System.out.println("enter second number =");
b = sc.nextInt();
int c=a;
a=b;
b=c;
System.out.println("first number="+a);
System.out.println("second number="+b);
}}
