import java.util.Scanner;
class RBI
 {
int getroi()
 {
    return 4;
 }
}
class SBI extends RBI
{
int getroi() 
{
    return 7;
}
}
class ICICI extends RBI 
{
int getroi()
 {
return 8;
}
}
class PNB extends RBI 
{
int getroi() 
{
return 9;
}
}
public class bankacc 
{
public static void main(String[] args)
 {	
Scanner sc = new Scanner(System.in);
System.out.print("enter the bank name to find the rate of interest: ");
String bank = sc.nextLine();
System.out.print(bank+" rate of interest:");
sc.close();
RBI r = new RBI();
SBI s = new SBI();
ICICI i = new ICICI();
PNB p = new PNB();
switch(bank) 
{
case "SBI":
System.out.println(s.getroi()+"%");
break;
case "ICICI":
System.out.println(i.getroi()+"%");
break;
case "PNB":
System.out.println(p.getroi()+"%");
break;
case "RBI":
System.out.println(r.getroi()+"%");
break;
default:
System.out.println(" invalid option");
}
}
}

