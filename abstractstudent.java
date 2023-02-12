import java.io.*;
abstract class student
{
abstract void name();
}
class newstudent extends student
{
public void name()
{
System.out.println("Shivam");
}
}
public class abstractstudent
{
public static void main(String[]args)
{
student st=new newstudent();
st.name();
}
}