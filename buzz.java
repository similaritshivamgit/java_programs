import java.util.Scanner;
public class buzz
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.print("enter any number =");
int num=sc.nextInt();
if(num%10==7||num%7==0)
{
System.out.println("buzz number");
}
else
{
System.out.println("not a buzz number");
}
}
}