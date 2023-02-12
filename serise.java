import java.util.Scanner;
public class serise
{
public static void main(String args[])
{
int s=0,a=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter your range =");
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
s=s*10+a;
System.out.println(s);
}
}}