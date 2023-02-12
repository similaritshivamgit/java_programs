import java.util.Scanner;
import java.io.*;
public class arraylarge
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array=");
int size=sc.nextInt();
int a[]=new int[size];
int b[]=new int[size];
System.out.println("enter the number of array=");
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
b[i]=a[i];
}
for(int i=0;i<size;i++)
{
for(int j=0;i<size;j++)
{
if(a[i]>b[i])
{
System.out.println(a[i]);
}
}
}
}
}
