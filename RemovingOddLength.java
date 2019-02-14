import java.util.ArrayList;
import java.util.List;


public class RemovingOddLength {

	public static void main(String[] args) {
	List<String> lists=new ArrayList<>();
	lists.add("Bhavesh");
	lists.add("urvi");
	lists.add("Shweta");
	lists.add("falguni");
	lists.removeIf(i->i.length()%2!=0);
	System.out.println(lists);
	}

}
