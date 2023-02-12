import java.util.Scanner;
public class table
{
public static void main(String[]args)
{
int i=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number =");
int num=sc.nextInt();
while(i<=10)
{
int t=num*i;
System.out.println(num +"*"+i+"="+t);
i++;
}
}}