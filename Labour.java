
public class Labour extends Employee {
private int total;
	public Labour(String name, int salary) {
		super(name, salary);
		
	}
	public void setTotal()
	{
		
	}
	public int gettotal(int time) {
		total=time*100+salary;
		return total;
	}
    
}
