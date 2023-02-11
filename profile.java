class employee
{
String name,designation,status;
int id,salary;
employee()
{
name="prashu";
id=158;
designation="student";
salary=200000;
status="single";
}
employee(String a,int b,String c,int d,String e)
{
name=a;
id=b;
designation=c;
salary=d;
status=e;
}
void display()
{
System.out.println(" name: "+name+" \nid: "+id+" \ndesignation: "+designation+" \nsalary :"+salary+" \nstatus: "+status);
}
}
class profile
{
public static void main(String args[])
{
employee e = new employee();
employee e1 = new employee("harry",29,"singer",1000000000,"single");
e.display();
e1.display();
}
}
