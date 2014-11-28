public class CircularPrimes
{
	/*
	 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.
	 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
	 * How many circular primes are there below one million?
	 */
	
	/* Take in an input number and return true if there is a prime number below the input number
	* Otherwise return false
	*/
	public static boolean isPrime( long number )
	{
		for( int mod = 2; mod <= Math.sqrt( number ); ++mod )
		{
			if( number % mod == 0 ) { return false; }
		}
		return true;
	}
	
	/**
	 * @param target is the maximum number that we're going up to trying to find circular primes
	 * Look at a number and convert it to string to be able to call functions such as CharAt and substring
	 * Reverse the number using substring and do this for the number of digits
	 * If the number is prime add one to the counter
	 *  
	 */
	public static void isCircular( long target )
	{
		int count = 0;

		for ( long i = 2; i < target; ++i )
		{
			if ( isPrime( i ) )
			{
				String num = Long.toString( i );
				boolean a = false;
				String temp = num;
				for ( int j = 0; j < num.length(); ++j )
				{
					temp = temp.charAt( temp.length() - 1 ) + temp;
					temp = temp.substring( 0, temp.length() - 1 );
					if ( !isPrime( Long.parseLong( temp ) ) )
					{
						a = false;
						break;
					} 
					else{ a = true; }
				}
				if ( a == true ){ count++; }
			}
		}
		System.out.println("There are " + count + " prime numbers below " + target + " that are circular primes!!!" );
	}

	public static void main( String[] args )
	{
		isCircular( 1000000 );
	}
}