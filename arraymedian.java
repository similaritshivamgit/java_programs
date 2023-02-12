import java.util.Scanner;
import java.io.*;
public class arraymedian
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the range of first array=");
int m=sc.nextInt();
int arr1[]=new int[m];
System.out.println("enter the value of first array=");
for(int i=0;i<m;i++)
{
arr1[i]=sc.nextInt();
}
System.out.println("enter the range of second array=");
int n=sc.nextInt();
int arr2[]=new int[n];
System.out.println("enter the value of second array=");
for(int i=0;i<n;i++)
{
arr2[i]=sc.nextInt();
}
int z=m+n;
int arr3[]=new int[z];
for(int i=0;i<m;i++)
{
arr3[i]=arr1[i];
}
for(int i=0;i<n;i++)
{
arr3[m+i]=arr2[i];
}
for (int i=0 ;i<z;i++)
{
System.out.print(arr3[i]);
}
if (z%2==0)
{

}
}