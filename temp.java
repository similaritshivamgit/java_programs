import java.io.*;
import java.util.Scanner;
class temp
{
public static void main(String args[])throws IOException
{
Scanner sc= new Scanner(System.in);
System.out.println("enter your temperature in ferhenhite =");
float temp= sc.nextFloat();
double cel = (0.55)*(temp-32);
System.out.println("temperature in celcius ="+cel);
}}

