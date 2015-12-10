import java.util.*;
public class Security{
private List<String> list;

public Security(String time, String date, String id)
{
	list = new ArrayList<String>();
	list.add(date);
	list.add(time);
	list.add(id);
}
public void addEntry(String time, String date, String id)
{
	list.add(date);
	list.add(time);
	list.add(id);
}
public String returnEntry(int index)
{
	int place = index*3;
	return list.get(place - 1) + " " + list.get(place - 2) + " " + list.get(place - 3);
}
public int returnNumberOfEntries()
{
	return list.size() / 3; 
}
public static void main(String[] args){
Security a = new Security("10:00", "01011999", "Bob123456");
a.addEntry("18:00", "01021999", "Jane3456");
System.out.println(a.returnNumberOfEntries());
System.out.println(a.returnEntry(1));
System.out.println(a.returnEntry(2));
}
}
