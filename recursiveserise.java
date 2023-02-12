import java.io.*;
import java.util.*;
public class recursiveserise
{
public static void serise(int n)
{
if(n==0)
{
return;
}
System.out.println(n);
serise(n-1);
}
public static void main(String args[])
{
int n=5;
serise(n);
}
}