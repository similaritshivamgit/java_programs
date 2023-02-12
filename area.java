import java.io.*;
class area
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String str,str1;
int b,h;
double a;
System.out.print("enter b and h:");
str=br.readLine();
str1=br.readLine();
b=Integer.parseInt(str);
h=Integer.parseInt(str1);
a=0.5*b*h;
System.out.print("area ="+a);
}
}
