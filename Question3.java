import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;


public class Question3 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"urvi");
		map.put(2,"shweta");
		map.put(3,"bhavesh");
		
   BiConsumer<Map<Integer,String>,String> biConsumer=Question3::useInterface;
	biConsumer.accept(map,"ankzn");
	}



		public static void useInterface(Map<Integer,String> map,String mapname) 
		{
			
		System.out.println(mapname);
		map.forEach((u,v)->System.out.println(u));


}
}
