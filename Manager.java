
public class Manager extends Employee{

	private int incentive;
	private int total;

	public Manager(String name, int salary) {
		super(name, salary);
	
	}
	public void setincentive(int incentive)
	{
		total= incentive+salary;;
		
	}
	public int gettotal()
	{
		return total;
	}

}
