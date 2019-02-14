import java.util.Scanner;


public class Assignmentq4 {
	

	public static void main(String[] args) {
		Assignmentq4 assignmentq4 = new Assignmentq4();
		// TODO Auto-generated method stub
      Scanner scanner=new Scanner(System.in);
      int income=scanner.nextInt();
      if(income<=180000)
      {
    	  System.out.println("No tax amount");
      }
      else if(income<=300000)
      {  double tax;
    	  tax=0.1*income;
    	  System.out.println("tax amount is:"+tax);
      }
      else if(income<=500000)
	{
		double tax;
		tax=0.2*income;
		System.out.println("tax amount is:"+tax);
	}
      else if(income<=1000000)
      {
    	  double tax;
  		tax=0.3*income;
  		System.out.println("tax amount is:"+tax);
      }

}
}