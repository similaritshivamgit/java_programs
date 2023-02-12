import java.util.Scanner;
public class prime
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int num, count=0;
System.out.print("enter any number =");
num=sc.nextInt();
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("number is prime");
}
else
{
System.out.println("number is not prime");
}
}}