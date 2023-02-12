import java.util.Scanner;
import java.io.*;
public class array2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int num[]=new int[5];
System.out.print("enter your number =");
for(int i=0; i<5;i++)
{
num[i]=sc.nextInt();
}
System.out.println("your output =");
for(int i=0;i<5;i++)
{
System.out.println(num[i]);
}
}}