import java.util.TreeSet;


public class Person {

	public static void main(String[] args) {
	TreeSet<Student> tree=new TreeSet<Student>(new Weight());
	tree.add(new Student("Karan",55,520));
	tree.add(new Student("Kajal",50,540));
	tree.add(new Student("Tisha",45,545));
	tree.add(new Student("Falguni",45,550));
	for(Student s:tree){
		System.out.println(s);
	}
	
	}

}
