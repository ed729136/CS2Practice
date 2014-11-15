import java.math.BigInteger;

public class FactorialDigitSum
{
	static double begin = System.nanoTime();
	public static BigInteger factorial( int number )
	{
		BigInteger fact = BigInteger.valueOf( 1 );
		for ( int i = 1; i <= number; ++i )
		{
			fact = fact.multiply( BigInteger.valueOf( i ) );
		}
		return fact;
	}
	   
	 public static int addition( String str )
	 {
		 int sum = 0;
		 for( int i = 0; i < str.length(); ++i )
		 {
			 int count = Integer.parseInt( str.substring( i, i + 1 ) );
			 sum += count;
		 }
		 return sum;		   
	 }
	 
	 public static void main( String[] args )
	 {
		 BigInteger fact = factorial( 1000 );
		 System.out.println("Factorial is " + fact);
		 System.out.println( addition( fact.toString() ) );
		 double end = System.nanoTime();
		 double time = end - begin;
		 System.out.println( time + " ns" );
	 }
}
