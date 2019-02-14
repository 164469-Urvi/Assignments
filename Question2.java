
public class Question2 {

	public static void main(String[] args) {
	orders orderer=(w,v)->{
		if(w>10000 && (v=="Completed" || v=="Accepted"))
	
		{
		System.out.println("the order price is"+w+" order status is"+v);
	    }
	else
	{
		
	}
	};
	orderer.order(10001,"Completed");
	orderer.order(5000,"incomplete");
	}
	

}
interface orders
{
	void order(int a,String b);
}