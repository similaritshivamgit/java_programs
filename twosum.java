import java.io.*;
import java.util.Scanner;
public class twosum
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array=");
int size= sc.nextInt();
int arr[]=new int[size];
System.out.println("enter the value of array =");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter the target=");
int t=sc.nextInt();
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
if(arr[i]+arr[j]==t)
{
System.out.println("("+i+","+j+")");

}
}
}
}
}