import java.util.Scanner;
import java.io.*;
public class arrayaverage
{
public static void main(String[]args)
{int s=0;
float av;
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array =");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter the numbers of array =");
for (int i=0;i<size;i++)
{
a[i]=sc.nextInt();
s=s+a[i];
}
System.out.println("sum of array="+s);
av=s/size;
System.out.println("average of array="+av);
}
}