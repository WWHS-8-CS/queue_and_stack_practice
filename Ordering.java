import java.util.*;
public class Ordering {
	private	String[] customers;
	private int line; 

public Ordering(int maxLength)
{
	customers = new String[maxLength];
	line = 0;
	for(String i: customers)
		i = null;
}
public void enqueue(String name) 
{
	if(line >= customers.length)
		throw new IllegalStateException("Can't add to a full queue.");
	customers[line] = name;
	line++;
}
public String dequeue() 
{   
	if (customers[0] == null)
     		throw new IllegalStateException("Can't dequeue from an empty queue.");
     	String firstPerson = customers[0];
	line--;
	for(int i = 1; i < customers.length; i++)
	{
		customers[i-1] = customers[i];
	}
	customers[line] = null;
   	return firstPerson;
   
}
public String peek()
{
	return customers[0];
}
public static void main(String[] args) {
Ordering a = new Ordering(3);
a.enqueue("bob");
System.out.println(a.peek());
a.enqueue("jane");
System.out.println(a.peek());
System.out.println(a.dequeue());
System.out.println(a.peek());
System.out.println(a.dequeue());
System.out.println(a.peek());
System.out.println(a.dequeue());
}
}
