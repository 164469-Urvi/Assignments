import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Question5 {
//	StringBuilder stringBuilder=new StringBuilder();

	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder("Urvi");
		List<StringBuilder> lists=new ArrayList<>();
		lists.add(stringBuilder);
		StringBuilder stringBuilder1=new StringBuilder("Shweta");
		lists.add(stringBuilder1);
		StringBuilder stringBuilder2=new StringBuilder("Kajal");
		lists.add(stringBuilder2);
		//lists.stream().map(i->i.charAt(0)).forEach(System.out::println);

	 Consumer<List<StringBuilder>> consumer=(y)->{
			lists.stream().map(i->i.charAt(0)).forEach(System.out::println);
	 };
	//consumer.accept(lists);
consumer.accept(lists);

	}
	
}
