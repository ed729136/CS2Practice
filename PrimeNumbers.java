public class PrimeNumbers
{	
	/*	
	 * method to find if a number is prime or not, returns a boolean
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
	 * This function takes in counter as a parameter
	 * Counter is ith prime number
	 */
	public static void primeNumberCounter( int counter )
	{
		int count = 1;
		int num = 2;
		while( counter != count )
        {
            	if( isPrimeNumber( num ) )
                {
                    System.out.println( num + " " + count++ );
                }
            	num++;
        }
	}
		
		public static void main( String[] args ) 
		{
			primeNumberCounter( 10002 );
		}
}