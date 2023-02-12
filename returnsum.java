import java.io.*;
import java.util.Scanner;
class sum
{
public int input()
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int s=a+b;
return s;
}
}
public class returnsum
{
public static void main(String[]args)
{
sum su=new sum();
su.input();
}
}