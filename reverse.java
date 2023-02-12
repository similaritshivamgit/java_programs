import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class reverse
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your range:");
int r=sc.nextInt();
int val[]=new int[r];
System.out.println("enter your values:");
for(int i=0;i<r;i++)
{
val[i]=sc.nextInt();
}
for(int i=r-1;i>=0;i--)
{
System.out.println(val[i]);
}
}
}