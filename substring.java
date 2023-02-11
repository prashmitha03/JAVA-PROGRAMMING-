import java.util.*;
public class substring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter text:");
String s=sc.next();
String a= new String();
for(int i=0;i<s.length();i++)
{
int b=0;
for(int j=i+1;j<=s.length();j++)
{
for(int k=i;k<j-1;k++)
{
if(s.charAt(k)==s.charAt(j-1))
{
b++;
}
}
if(b>0)
{
j=s.length();
}
else if (b==0&&a.length()<j-i)
{
a=s.substring(i,j);
}
}
}
System.out.println(a);
}
}


