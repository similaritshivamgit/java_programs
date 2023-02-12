import java.util.Scanner;
import java.io.*;
class arrayremove
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array =");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("enter the array value=");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter the removal value=");
int rem=sc.nextInt();
for(int i=0;i<size;i++)
{
if(arr[i]!=rem)
{

//System.out.print(arr[i]);
}
}
}
}
