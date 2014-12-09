import java.math.BigInteger;

public class PowerDigitSum
{
	/**
	 * @param base is the number to be multiplied
	 * @param exponent is how many times the base is going to be multiplied
	 * @return total
	 * 
	 * A power function that returns a Big Integer so that there are no restrictions on storage when finding the power of a number
	 * Greatest value that I was able to calculate with this was 2 to the 8965 power
	 */
	public static BigInteger pow( int base, int exponent )
	{
		BigInteger total = BigInteger.valueOf( 0 );
		
		if( exponent == 0 )
		{
			return BigInteger.valueOf( 1 );
		}
		total = BigInteger.valueOf( base ).multiply( pow( base, --exponent ) );
		return total;
	}
	
	/**
	 * Take the BigInteger calculation of 2 to the 1000th and split it into an array of characters
	 * Get one number at a time from each position of the array and add it to sum, final sum gets printed and that is your answer
	 * Return the sum
	 */
	public static int sum( )
	{
		int sum = 0;
		BigInteger number = pow( 2, 1000 );
		char[] digits = number.toString().toCharArray();
		for( int i = 0; i < digits.length; ++i )
		{
			//System.out.println( digits[ i ] );	FOR DEBUGGIN PURPOSES!!!
			sum += Character.getNumericValue( digits[ i ] );
		}
		
		System.out.println( sum );
		return sum;
	}
	
	public static void main( String[] args )
	{
		sum( );
	}
}