import java.util.Scanner;
import java.io.*;
class swap2
{
public static void main(String args[])throws IOException
{
Scanner sc = new Scanner(System.in);
System.out.println("enter first number =");
int a = sc.nextInt();
System.out.println("enter second numder =");
int b = sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("first number ="+a);
System.out.println("second number ="+b);
}}