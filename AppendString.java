import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;


public class AppendString {

	public static void main(String[] args) {
	Map<String,String> map=new HashMap<>();
	map.put("Urvi","Patwa");
	map.put("Sneha","Kashyap");

	System.out.println(map.entrySet().stream().map(i->i.getKey().concat(i.getValue()))
			.collect(Collectors.toList()));
	}

}
