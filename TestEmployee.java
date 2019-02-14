import java.util.Scanner;


public class TestEmployee {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Manager manager=new Manager("Falguni",60000);
		manager.setincentive(15000);
		  Manager[] staff=new Manager[2];
		staff[0]=manager;
		manager.setincentive(20000);
		
		Manager manager1=new Manager("bhavesh",65000);
		manager1.setincentive(25000);
		staff[1]=manager1;
		for(Manager m:staff){
			System.out.println("the employee name: " +m.getName()+"  is a manager whose salary is:"+m.getSalary()+"total salary with incentives is:"+m.gettotal());
		}
		
		Labour[] labour=new Labour[2];
		Labour labour1=new Labour("arjun",15000);
		labour[0]=labour1;
		Labour labour2=new Labour("karan",10000);
		labour[1]=labour2;
		
		for(Labour l:labour)
		{   System.out.println("enter no of extra hours of work for labourers");
			System.out.println("the employee name : "+ l.getName()+"  is a labourer whose salary is:"+l.getSalary()+"total salary plus overtime salary is:"+l.gettotal(scanner.nextInt()));
		}
	}
	}  