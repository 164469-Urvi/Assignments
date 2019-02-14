
public class Assignmentq8 {

	public static void main(String[] args) {
	Assignmentq8 assignmentq8=new Assignmentq8();
	int array[]=new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	int i,j,temp;
	for(i=0;i<array.length;i++)
	{
		for(j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j])
			{
				temp=array[j];
				array[j]=array[i];
				array[i]=temp;
			}
		}
	}
   for(int k=0;k<array.length;k++)
   {
	   System.out.println(array[k]);
   }
	}

}
