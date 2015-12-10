import java.util.*;
public class ToDo{
private List<List<Individual>> mainList; 



public ToDo(List<String> subList)
{
	mainList = new ArrayList<List<Individual>>(1);
	mainList.add(subList);
} 

public void addTask(List<String> subList)
{
	mainList.add(subList);
}

public List<List<Individual>> returnTask()
{
	return mainList;
}
public String toString()
{
	String all = null;
	for(List<String> i: mainList)
		for(String j: i){
			all += j;
			all += “ “;
	}
	return all;
}





}
