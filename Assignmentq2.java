
public class Assignmentq2 {

	public void armstrong()
	{ int count,value,number,result=0;
	for(count=100;count<=999;count++)
	{ value=count;
		//System.out.println(count+ " " +value);
		
		while(value>0)
		{
			number=value%10;
			//System.out.println(number);
			result=result+(number*number*number);
		          value=value/10;
			
		}
		
		
		//System.out.println(result);
		if(result==count)
		{
			System.out.println(result);
		}
		result=0;
	
	}
	}	
	
	
	public static void main(String[] args) {
		Assignmentq2 assignmentq2=new Assignmentq2();
		assignmentq2.armstrong();
		

	}

}
