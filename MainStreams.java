import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class MainStreams {

	public static void main(String[] args) {
	Fruit fruit=new Fruit("Apple",100,60,"Red");
	List<Fruit> list=new ArrayList<Fruit>();
	list.add(fruit);
	Fruit fruit1=new Fruit("Orange",60,30,"Orange");
	list.add(fruit1);
	Fruit fruit2=new Fruit("Banana",60,30,"Yellow");
	list.add(fruit2);
	Fruit fruit3=new Fruit("Watermelon",100,30,"Red");
	list.add(fruit3);
	list.stream().filter(i->i.getCalories()<100).forEach(System.out::println);
	System.out.println("\n");
	list.stream().map(i->i).sorted(Comparator.comparing(Fruit::getColor)).forEach(System.out::println);
	System.out.println("\n");
	list.stream().map(i->i).filter(i->i.getColor()=="Red").sorted(Comparator.comparing(Fruit::getPrice)).forEach(System.out::println);
	 News news1=new News(1,"urvi","kajal","amazing");
	 News news2=new News(2,"sneha","sweta","budget");
	 News news3=new News(3,"sweta","urvi","incredible");
	 News news4=new News(1,"urvi","drashti","budget is the budget");
	 News news5=new News(1,"urvi","falguni","genius");
	 News news6=new News(4,"parthi","karan","budget");
	 List<News> listed=new ArrayList<News>();
	 listed.add(news1);
	 listed.add(news2);
	 listed.add(news3);
	 listed.add(news4);
	 listed.add(news5);
	 listed.add(news6);
	 
	System.out.println(listed.stream().max(Comparator.comparing(News:: getComment)).get().newsId);
	System.out.println("\n");
	System.out.println("-------");
	System.out.println(listed.stream().filter(i->i.getComment().contains("budget")).count());
	System.out.println("\n");
	System.out.println("user");
	System.out.println(listed.stream().max(Comparator.comparing(News::getPostedByUse)).get().getPostedByUse());
	System.out.println("\n");
listed.stream().sorted(Comparator.comparing(News:: getCommentByUser)).map(i->i).forEach(System.out::println);
	


Transaction transaction1=new Transaction((new Trader("urvi","Mumbai")), 2000,20000);
Transaction transaction2=new Transaction((new Trader("kajal","pune")), 1996,25000);
Transaction transaction3=new Transaction((new Trader("shweta","mangalore")), 1998,30000);
Transaction transaction4=new Transaction((new Trader("pooja","pune")),2011,31000);
Transaction transaction5=new Transaction((new Trader("jill","delhi")),2011,35000);
Transaction transaction6=new Transaction((new Trader("zeel","indore")),2011,19000);

List<Transaction> listeds=new ArrayList<Transaction>();
listeds.add(transaction1);
listeds.add(transaction2);
listeds.add(transaction3);
listeds.add(transaction4);
listeds.add(transaction5);
listeds.add(transaction6);
System.out.println("---------------------------------------------------------------------------");
listeds.stream().filter(i->i.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);;
System.out.println(listeds.stream().map(i->i.trader.getCity()).distinct().collect(Collectors.toList()));

System.out.println("list of traders in pune");
listeds.stream().map(i->i.trader.getCity()=="pune").sorted().collect(Collectors.toList());
System.out.println("--------------------------------------------");
listeds.stream().map(i->i.trader.getName()).sorted().forEach(System.out::println);

listeds.stream().filter(i->i.trader.getCity()=="indore").map(i->i).forEach(System.out::println);
listeds.stream().map(i->i.trader.getCity()=="delhi").collect(Collectors.toList());

	System.out.println(listeds.stream().filter(i->i.trader.getCity()=="delhi").map(i->i).collect(Collectors.toList()).toString());
	
	System.out.println("//////////////");
	;
	System.out.println(listeds.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue());
	
	System.out.println(listeds.stream().min(Comparator.comparing(Transaction::getValue)).get().getValue());
}
}
