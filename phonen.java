import java.util.*;
import java.io.*;
import java.lang.*;
class phonen
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
A a = new A();
System.out.println("enter number:");
int n = sc.nextInt();
System.out.println("enter number:");
int m = sc.nextInt();
if ((2<=n&&n<=9)&&(2<=m&&m<=9))
{
System.out.println("");
}
else
{
throw new NumberFormatException("enter valid choice!!");
}
String x = a.method(n);
String y = a.method(m);
for(int i=0;i<x.length();i++)
{
for (int j=0;j<x.length();j++)
{
System.out.println(x.charAt(i)+""+y.charAt(j));
}
}
}
}
class A
{
String method(int n)
{
if (n==2)
   return "abc";
else if (n==3)
   return "def"; 
else if (n==4)
   return "ghi";  
else if (n==5)
   return "jkl";  
else if (n==6)
   return "mno"; 
else if (n==7)
   return "pqrs";  
else if (n==8)
   return "tuv";  
else 
   return "wxyz";  
}
}
   
   
   
   
   
           
