import java.util.*;
interface salary
{
void display();
}
class contract implements salary
{
int amo=10+5+15;
public void display()
{
System.out.println("total amount"+amo);
}
}
class regular implements salary
{
int amo=60+5+85;
public void display()
{
System.out.println("total amount"+amo);
}
}
class wages
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter id:");
String id=sc.nextLine();
sc.close();
System.out.println("SALARY DETAILS");
if(id.charAt(0)=='C')
{
salary s=new contract();
s.display();
}
else if(id.charAt(0)=='R')
{
salary s=new regular();
s.display();
}
else
{
System.out.println("invalid ID");
}
}
}



