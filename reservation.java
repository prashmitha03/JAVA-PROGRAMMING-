class reservation
{
public static void main(String[] args)
{
Reservation reserve = new Reservation(); 
Person thread1 = new Person(reserve, 5); 
thread1.start();
Person thread2 = new Person(reserve, 4);
thread2.start();
Person thread3 = new Person(reserve, 2);
thread3.start();
}
}
class Reservation
{
static int a = 10;
synchronized void b(int r) 
{
System.out.println(Thread.currentThread().getName() + " entered.");
System.out.println("Availableseats : " + a + " Requestedsetas : " + r);
if (a >= r)
{
System.out.println("Seat Available. Reserve now :-)");
try
{
Thread.sleep(100); 
}
catch (InterruptedException e)
{
System.out.println("Thread interrupted");
}
System.out.println(r+ " seats reserved.");
a = a - r;
}
else
{
System.out.println("Requested seats not available :-(");
}
System.out.println(Thread.currentThread().getName() + " leaving.");
System.out.println("----------------------------------------------");
}
}
class Person extends Thread
{
Reservation r1;
int r2;
public Person(Reservation r1, int r2)
{
this.r1 = r1;
this.r2 = r2;
}
public void run() 
{
r1.b(r2);
}
}







