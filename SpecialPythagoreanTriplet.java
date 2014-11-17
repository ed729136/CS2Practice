public class SpecialPythagoreanTriplet
{
	/*
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	 * a2 + b2 = c2
	 * For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 */
	public static int triplet( int sum )
	{
		int a = 1; 
		int b = 1; 
		int c = 0;
	        
		while( true )
	    {
			c = sum - a - b; 

			if( Math.pow( a, 2 ) + Math.pow( b, 2 ) == Math.pow( c, 2 ) )
			{
				break;
			}
			
			else if ( a < b - 1 )
			{
				a++;
			}

			else
			{
				a = 0; 
				b++;
				c = b + 1; 
			}
	    }
		System.out.println( "A: " + a + " B: " + b +  " C: " + c );
		System.out.println( a * b * c );
		return a * b * c; 
	  }
	
	public static void main( String[] args )
	{
		triplet( 1000 );
	}
}