package Access_Specifier;

public class test6
{
	// default variable & default method access within the class in same package
	int a=60;
	test6()
	{
		
	}
	public static void main(String[] args)
	{
		test6 T6=new test6();
			  T6.M1();
			  System.out.println(T6.a);
				
	}
	// default Non Static Method 
	void M1()
	{
		System.out.println("Good Night");
		
	}
	
}
