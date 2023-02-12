import java.io.*;
class meter
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String str;
int k,m;
System.out.print("enter the distance in km:");
str=br.readLine();
k=Integer.parseInt(str);
m=k*1000;
System.out.println("meter="+m);
}
}