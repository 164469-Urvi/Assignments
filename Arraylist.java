import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Arraylist {

	public static void main(String[] args) {
		List<Integer> c=new ArrayList<>();
		Random random=new Random();
		for(int i=1;i<=10;i++)
		{
			c.add(random.nextInt(20));
		}
		Collections.sort(c);
		c.add(5);
		c.add(7);
		c.add(9);
		c.add(2,10);
		//c.add("urvi");
		//c.add(5.5);
		for(Object o:c)
		{
		  System.out.println(o);
		}
	}

}
