import java.util.Scanner;
import java.io.*;
public class arraysum
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int b[]=new int[5];
System.out.println("enter numbers for array a=");
for(int i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter number for array b=");
for(int i=0;i<5;i++)
{
b[i]=sc.nextInt();
}
System.out.println("sum of arrays=");
for(int i=0;i<5;i++)
{
int s=a[i]+b[i];
System.out.println(s);
}
}
}