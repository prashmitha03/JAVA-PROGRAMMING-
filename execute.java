import number.*;
import java.util.*;
import java.lang.*;
class execute
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter roman:");
String s =sc.next();
roman r=new roman();
int res=r.romanToInteger(s);
System.out.println(""+res);
}
}
