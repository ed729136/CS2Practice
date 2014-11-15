public class SummationOfPrimes
{
	/*
	 * Function that finds if a number is prime
	 */
	public static boolean isPrimeNumber( int number )
	{
		for( int mod = 2; mod <= Math.sqrt( number ); ++mod )
		{
			if( number % mod == 0 )
			{
				return false;
			}
		}
		return true;
	 }
	
	/*
	 * Go through all the numbers from 2 to the endNumber which is the parameter of the function,
	 * checks to see if the number is prime and adds this new found prime number
	 * 
	 * Function returns a long because otherwise it will not be large enough to hold the sum of all 
	 * the prime numbers less than 2 million
	 */
	public static long primeSummation( int endNumber )
	{
		long sum = 0;
		for( int i = 2; i < endNumber; ++i )
		{
			if( isPrimeNumber( i ) )
			{
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main( String[] args )
	{
		System.out.println( primeSummation( 2000000 ) );
	}

}