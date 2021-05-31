
public class BuiltInExceptions {
	static void ArithmeticException()
  {
	try 
	{
		int b=34;
		int div=0;
		div=b/0;
	}
	catch (ArithmeticException e)
	{
		System.out.println("Arithmetic Exception...");
	}
  }
	 static void NullPointer()
     {

	   try
	   {
		String as=null;
		System.out.println(as.charAt(0));
	   }
	catch (NullPointerException e)
	   {
		System.out.println(" NullPointerException...");
	   }
     }
	 
	static void ArrayBound()
	 {
		try
		{
		  int[] a= {12,13,14};
		  System.out.println(a[5]);
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" ArrayIndexOutOfBoundsException...");
		}
	 }
		 
		static void StringException()
		{
		  try
		  {
			  String s="Nikhil";
			  System.out.println(s.charAt(7));
		  }
		  catch (StringIndexOutOfBoundsException e)
		  {
			  System.out.println(" StringIndexOutOfBoundsException...");
		  }
		  
		   
		}
	 
	 
	public static void main(String[] args) {
		ArithmeticException();
		NullPointer();
		ArrayBound();
		StringException();
		
		
		
		
		
	}

}
