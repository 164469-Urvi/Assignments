import java.util.Scanner;


public class Assignmentq7 {

	public static void main(String[] args) {
		int array[]=new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int i;
		Assignmentq7 assignmentq7=new Assignmentq7();
		Scanner scanner =new Scanner(System.in);
		int number=scanner.nextInt();
		for(int j=0;j<array.length;j++)
		{
			if(array[j] ==number)
			{
				System.out.println("the position of element is "+j);
			}
		}
	}

}
