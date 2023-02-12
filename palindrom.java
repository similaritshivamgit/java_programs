import java.util.Scanner;
public class palindrom
{
public static void main(String[]args)
{
int p=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter any number=");
int num=sc.nextInt();
int n=num;
while(n>0)
{
int s=n%10;
n=n/10;
p=p*10+s;
}
System.out.println(p);
if(p==num)
{
System.out.println("palindrom number");
}
else
{
System.out.println("not palindrom number");
}}}