import java.util.HashSet;
import java.util.LinkedHashSet;


public class HashandLinkedhashset {

	public static void main(String[] args) {
	HashSet<Integer> hashsets=new HashSet<Integer>();
    hashsets.add(15);
    hashsets.add(20);
    hashsets.add(55);
    hashsets.add(10);
    hashsets.add(8);
    hashsets.add(4);
    System.out.println("Output for HashSet is");
   
    	System.out.println(hashsets);
    
    System.out.println("-----------------------");
    LinkedHashSet<Integer> linked=new LinkedHashSet<Integer>();
    linked.add(15);
    linked.add(20);
    linked.add(55);
    linked.add(10);
    linked.add(8);
    linked.add(4);
	
  System.out.println("Output for Linked HashSet is");

	  System.out.println(linked);
  
}
}