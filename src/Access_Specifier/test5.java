package Access_Specifier;

public class test5
{
	/*access of private keyword in class only means only for test5 class only
	 * 
	 */
	private int a=20;
	
	private test5()
	{
		
	}
	 public static void main (String [] args)
	 {
		 test5 T5=new test5();
		       T5.m2();
		       System.out.println(T5.a);
	 }
	 private void m2()
	 {
		 System.out.println("Good Afternoon");
		 
	 }
}
