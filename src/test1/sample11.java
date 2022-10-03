package test1;

public class sample11
{
	public static void main(String[] args) 
	{
		// explicit casting not good  for use because we loss the data 
		// it is risks for use
		
		double b=2.5;					// Size= 8 Byte
		System.out.println(b);
		
		// explicit casting used for decrease size of datatype
		
		int a=(int)b;                 // size= 4 Byte
		
		System.out.println(a);
	}


}
