import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;


public class Weight implements Comparator<Student> {

	public int compare(Student s1,Student s2) {
	if(s1.getWeight()>s2.getWeight())	
	{
		return 1;
	}
	else if(s1.getWeight()==s2.getWeight())
	{
		if(s1.getHeight()>s2.getHeight()){
			return 1;
		}
		else
		{
			return -1;
		}
	}
	else
	{
		return -1;
	}
	}

}
	