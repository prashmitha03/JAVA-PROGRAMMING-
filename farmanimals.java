import java.io.*;
import java.lang.*;
class farmanimal
 {
String place,food,sound;
void insert(String p,String f,String s)
 {
place = p;
food = f;
sound = s;
 }
void display()
 {
System.out.println(" stays in a "+place+" lives by eating "+food+" and makes a sound "+sound);
}
}
class farmanimals
 {
public static void main(String[] args)throws IOException
{
farmanimal cow = new farmanimal();
cow.insert("shed", "grass", "moo");
System.out.print("Cow");
cow.display();
farmanimal pig = new farmanimal();
pig.insert("pigsty", "biological materials", "grunt");
System.out.print("Pig");
pig.display();
farmanimal horse = new farmanimal();
horse.insert("stable", "grass", "neigh");
System.out.print("Horse");
horse.display();
}
}
