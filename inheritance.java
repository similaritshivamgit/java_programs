import java.util.Scanner;
class bca
{
public void course1()
{
System.out.println("c++");
System.out.println("python");
}
}
class mca extends bca
{
public void course()
{
course1();
System.out.println("java");
}
}
public class inheritance
{
public static void main(String[]args)
{
bca bb=new bca();
mca mm=new mca();
bb.course1();
mm.course();
}
}