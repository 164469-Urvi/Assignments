import java.util.Scanner;


public class Assignmentq5 {

	public static void main(String[] args) {
		Assignmentq5 assignmentq5 =new Assignmentq5();
		Scanner scanner=new Scanner(System.in);
       int marks1=scanner.nextInt();
       int marks2=scanner.nextInt();
       int marks3=scanner.nextInt();
       if(marks1>60 && marks2 >60 && marks3>60)
       {
    	   System.out.println("passed");
    	   
       }
        if(marks1>60 && marks2> 60 || marks2>60 && marks3>60 || marks1>60 && marks3>60 ){
		System.out.println("promoted");
		
	}
		
	
       if(marks1>60 || marks2>60 || marks3>60 ||( marks1<60 && marks2<60 && marks3<60))
       {
    	   if(marks2<60 && marks3<60 || marks1<60 && marks3<60 || marks1<60 && marks2<60)
    	   {
    		   System.out.println("failed");
    	   }
       }
	
}
}