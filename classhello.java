import java.io.*;
class hello
{
public void stat()
{
System.out.println("hello");
}
public void stat2()
{
System.out.println("world");
}
public void stat3()
{
System.out.println("xoxo");
}
}
public class classhello
{
public static void main(String[]args)
{
hello h=new hello();
h.stat();
h.stat2();
h.stat3();
}
}