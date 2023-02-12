import java.io.*;
import java.util.Scanner;
public class math
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter first number =");
int a=sc.nextInt();
System.out.print("enter Second number =");
int b=sc.nextInt();
double pw=Math.pow(a,b);
System.out.println("power="+pw);
double sq=Math.sqrt(a+b);
System.out.println("square root ="+sq);
System.out.println("max number  ="+Math.max(a,b));
System.out.println("min number ="+Math.min(a,b));

}
}