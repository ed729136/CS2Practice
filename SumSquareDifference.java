public class SumSquareDifference
{
	/*
	 * Both of these formulas are calculated from 1 to n which goes hand on hand with how both of these are explained
	 * therefore the implication of square of sums being greater than sum of squares exists.
	 */
	
	//Formula to find the square of sums
	//Optimization of division by 2 using shifting bitwise operator
	public static int SquareOfSum( int number )
	{
		int total = ( number * ( number + 1 ) ) >> 1;
		return total *= total;
	}
	
	//Formula to find the sum of squares	
	public static int SumOfSquares( int number )
	{
		int total = ( number * ( number + 1 ) * ( ( number << 1 )  + 1) ) / 6;
		return total;
	}
	
	public static void main( String[] args )
	{
		System.out.println( SquareOfSum( 100 ) - SumOfSquares( 100 ) );
	}
}