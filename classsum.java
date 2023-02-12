import java.util.Scanner;
import java.io.*;
class sum
{
public void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first no :");
int a=sc.nextInt();
System.out.println("enter second no :");
int b=sc.nextInt();
int s=a+b;
System.out.println("sum="+s);
}
public void output(int a,int b)
{
int s;
s=a+b;
System.out.println("sum = "+s);
}}
class classsum
{
public static void main(String[]args)
{
sum ob=new sum();
ob.input();
ob.output(2,5);
}

}