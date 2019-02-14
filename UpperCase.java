import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;


public class UpperCase {

	public static void main(String[] args) {
		List<String> lists=new ArrayList<String>();
		lists.add("Urvi");
		lists.add("Sunita");
		lists.add("Drashti");
		UnaryOperator<List<String>> unaryOperator=(t)->{lists.stream().map(k->k.replaceAll(k,k.toUpperCase())).forEach(System.out::println);
		return t;};
		unaryOperator.apply(lists);

	}

}
