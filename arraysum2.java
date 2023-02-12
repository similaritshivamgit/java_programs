import java.util.Scanner;
import java.io.*;
public class arraysum2
{
public static void main(String[]args)
{
int s=0;
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.print("enter your array values =");
for(int i=0;i<5;i++)
{
a[i]=sc.nextInt();
s=s+a[i];
}
System.out.println("sum ="+s);
}}