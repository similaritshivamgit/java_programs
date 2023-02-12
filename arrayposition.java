import java.io.*;
import java.util.Scanner;
public class arrayposition
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of an array=");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("enter the element of an array=");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter the number you find=");
int num=sc.nextInt();
for(int i=0;i<size;i++)
{
if(arr[i]==num)
{
System.out.println(i);
}
}
}
}
