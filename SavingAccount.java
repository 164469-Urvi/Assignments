
public class SavingAccount  {
private int accountbal;
	private int accid;
private String accountholdername;
private boolean issalaryaccount;
private Object o;

	SavingAccount(int bal,int id,String name)
	{
	  this.accountbal=bal;
	  this.accid=id;
	  this.accountholdername=name;
	}
	/*public boolean isIssalaryaccount() {
	return issalaryaccount;*/

	public void add(Object o)
	{
		this.o=o;
	}
public void setIssalaryaccount(boolean issalaryaccount) {
	this.issalaryaccount = issalaryaccount;
}
	public int getAccountbal()
	{
		System.out.println(accountbal);
		return accountbal;
	}
	public void setAccountbal(int accountbal)
	{
		this.accountbal=accountbal;
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
    public void withdraw(int amount)
    {
    	if(amount<=accountbal)
    	{
    		accountbal=accountbal-amount;
    	}
    	else
    	{
    		System.out.println("can't withdraw amount");
    	}
    }
    public void deposit(int amount)
    {
    	accountbal=accountbal+amount;
    }

	
	public String toString() 
	{
		return accountholdername+" "+accountbal+" "+accid;
		
	}
		
	}

