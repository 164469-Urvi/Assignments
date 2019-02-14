import java.util.Scanner;


public class Assignmentq6 {

	public static void main(String[] args) {
		Assignmentq6 assignmentq6=new Assignmentq6();
		int count;
		Scanner scanner=new Scanner(System.in);
		for(count=1;count<=3;count++)
		{    String names=scanner.next();
		     String passwords=scanner.next();
			if(names.equals("Urvi")&& passwords.equals("hello123"))
			{
				System.out.println("Welcome"+" "+names);
				break;
			}
			else
			{
				System.out.println("try again");
			}
		}
		if(count>3)
		{
			System.out.println("contact admin");
		}
  
	}

}
