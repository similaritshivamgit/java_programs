import java.util.Scanner;
import java.io.*;
public class pattern1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any number=");
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}
