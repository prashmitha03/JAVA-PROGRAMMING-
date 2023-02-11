import java.util.Scanner;
class vpar
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s;
s = sc.next();
int n  = s.length();
int find=0;
for(int i=0;i<n/2;i++)
{
if((s.charAt(i)=='{'&&s.charAt(n-1-i)=='}')||(s.charAt(i)=='['&&s.charAt(n-1-i)==']')||(s.charAt(i)=='('&&s.charAt(n-1-i)==')'))
{
find=0;
}
else
{
find=1;
break;
}
}
if((find==1)||(n%2!=0))
{
System.out.println("Invalid");
}
else
{
System.out.println("Valid");
}
}
}
