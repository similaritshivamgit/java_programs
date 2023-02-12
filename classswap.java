import java.io.*;
import java.util.Scanner;
class swap
{
private int a,b;
public void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your first number =");
a=sc.nextInt();
System.out.println("enter your second number =");
b=sc.nextInt();
}
public void output()
{
a=a+b;
b=a-b;
a=a-b;
System.out.println("first number ="+a);
System.out.println("second number ="+b);
}}
class classswap
{
public static void main(String[]args)
{
swap sw=new swap();
sw.input();
sw.output();
}
}
