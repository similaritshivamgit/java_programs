import java.util.Scanner;
import java.io.*;
class avg
{
public void sum()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number =");
int a=sc.nextInt();
System.out.println("enter second number =");
int b=sc.nextInt();
int c=a+b;
int avg=c/2;
System.out.println("sum ="+c);
System.out.println("avg ="+avg);

}}
public class oopsavg
{
public static void main(String[]args)
{
avg av=new avg();
av.sum();
}
}
