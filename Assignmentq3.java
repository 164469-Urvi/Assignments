import java.util.Scanner;


public class Assignmentq3 {

	public  void simpleInterest(int amount,int years,int rate)
	{int amount1,years1,rate1,interest;
		amount1=amount;
		years1=years;
		rate1=rate;
		interest=(amount1*years1*rate1)/100;
		System.out.println("Simple Interest:"+" "+interest);
	}
	
	public void compoundInterest(int amount2,int years2,int rate2,int number)
	{
		int amount3,years3,rate3,interest1,number1;
		amount3=amount2;
		years3=years2;
		rate3=rate2;
		number1=number;
		interest1=(amount3*(1+rate3/number)^(years3*number));
		System.out.println("compound interest:" +" "+interest1);
		
	}
	public static void main(String[] args) {
	
	
		Scanner scanner=new Scanner(System.in);

		 Assignmentq3 assignmentq3=new Assignmentq3();
		 assignmentq3.simpleInterest(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		 assignmentq3.compoundInterest(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		 
		

	}

}
