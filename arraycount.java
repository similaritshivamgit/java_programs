import java.util.Scanner;
import java.io.*;
public class arraycount
{
public static void main(String []args)
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the range of an array =");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("enter the element of an array =");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter the number you find out =");
int num=sc.nextInt();
for(int i=0;i<size;i++)
{
if(arr[i]==num)
{
System.out.println(i);
count++;
}
}
if(count==0)
{
System.out.println("-1");
}
}
}
