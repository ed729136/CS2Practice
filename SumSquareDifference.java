public class SumSquareDifference
{
		/*
		* Project Euler Problem 6
		 * The sum of the squares of the first ten natural numbers is,
		 * 12 + 22 + ... + 102 = 385
		 * 
		 * The square of the sum of the first ten natural numbers is,
		 * (1 + 2 + ... + 10)2 = 552 = 3025
		 * 
		 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
		 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
		 */

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