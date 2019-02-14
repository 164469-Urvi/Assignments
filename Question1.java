
public class Question1 {

	public static void main(String[] args) {
		arithmetic arithmetics=(x,y)->System.out.println(x+y);
		arithmetics.functions(10,20);
		arithmetic arithmetics1=(r,s)->System.out.println(r-s);
		arithmetics1.functions(60, 10);
		arithmetic arithmetics2=(r,s)->System.out.println(r*s);
		arithmetics2.functions(60, 10);

		arithmetic arithmetics3=(r,s)->System.out.println(r/s);
		arithmetics3.functions(60, 10);
	}

}
@FunctionalInterface
interface arithmetic{
	void functions(int a,int b);
}