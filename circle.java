import java.io.*;
class circle
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r;
double a,c;
System.out.print("enter the radius=");
r=Integer.parseInt(br.readLine());
a=3.142*r*r;
c=2*3.142*r;
System.out.print("area="+a);
System.out.print("circumference="+c);
}}