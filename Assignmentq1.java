import java.util.Scanner;


public class Assignmentq1 {
	int result=0;
	public void armstrong(int number){
	int value,newNum;
	value=number;
  while(number!=0)
	{
         newNum=number%10;
	    
		result=result+(newNum*newNum*newNum);
		number=number/10;
		
	}
  System.out.println(result);
  if(value==result)
  {
	  System.out.println("armstrong number");
  }
  else
  {
	  System.out.println("not armstrong number");
  }
	}

	public static void main(String[] args) {
		Assignmentq1 assignmentq1=new Assignmentq1();
		Scanner scanner=new Scanner(System.in);
	
		assignmentq1.armstrong(scanner.nextInt());

	}

	
}
