import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class table2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your first element of table:");
int n=sc.nextInt();
System.out.println("enter your last element of table:");
int m=sc.nextInt();
for(int i=1;i<=10;i++)
{
for(int j=n;j<=m;j++)
{
System.out.print(i*j);
System.out.print(" ");
}
System.out.println(" ");
}
}}