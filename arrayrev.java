import java.util.Scanner;
import java.io.*;
public class arrayrev
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array =");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter the value of array =");
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
for(int i=size-1;i>=0;i--)
{
System.out.print(a[i]);
}
}
}