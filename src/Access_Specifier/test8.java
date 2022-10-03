package Access_Specifier;

public class test8 
{
	protected int a=70;
	
	public static void main(String[] args) 
	{
		test8 T8=new test8();
		      T8.M1();
		      System.out.println(T8.a);
		
	}
	protected void M1()
	{
		System.out.println("Good Night");
	}
	
	

}
