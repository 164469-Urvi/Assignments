


public class Employee {
	String name;
	int id;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
   public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


public String toString()
   {
	return name.toString()+" "+id;
	   
   }

}
