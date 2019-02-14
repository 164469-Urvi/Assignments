import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class BankAccountList implements Comparator<SavingAccount>{
	public static void main(String[] args) {
	
		SortedSet<SavingAccount> sort=new TreeSet<SavingAccount>(new BankAccountList());
		SavingAccount s1=new SavingAccount(55000,55,"Urvi");
	
	    SavingAccount s2=new SavingAccount(65000,54,"shweta");

	    SavingAccount s3=new SavingAccount(75000,65,"Drashti");
	   
	    sort.add(s1);
	    sort.add(s2);
		 sort.add(s3);
	
	 
	  for(SavingAccount s:sort)
	   {
		   System.out.println(s.getAccountholdername()+" "+s.getAccid()+" "+s.getAccountbal());
		   
	   }
	}

	@Override
	public int compare(SavingAccount s1, SavingAccount s2) {
		if(s1.getAccid()==s2.getAccid())
		{
			return 0;
		}
		else if(s1.getAccid()> s2.getAccid())
		{
			return 1;
		}
		else
		return -1;
	}

	

}
