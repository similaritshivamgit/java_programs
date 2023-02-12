import java.util.Scanner;
public class facto
{
public static void main(String[]args)
{
int f=1;
Scanner sc=new Scanner(System.in);
System.out.print("enter any number =");
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
f=f*i;
}
System.out.println("factorial of your number ="+f);
}}