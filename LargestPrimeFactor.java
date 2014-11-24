public class LargestPrimeFactor
{	
	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ? 
	 */
	
	/*
	 * First find if the number is not prime, if the number is not prime
	 * divide the number by the current modulo and make that your new number
	 * 
	 * By the end you will be returning the greatest prime factor because prime
	 * numbers cannot be divided into anymore
	 */
	public static long PrimeFactor( long number )
	{
		for( long mod = 2; mod <= Math.sqrt( number ); ++mod )
		{
			if( number % mod == 0 )
			{
				number = number / mod;
				mod--;
			}
		}
		return number;
	}
	
	public static void main( String[] args )
	{
		System.out.println( PrimeFactor( 600851475143L ) );
	}
}