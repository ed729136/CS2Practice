public class SumSquareDifference
{
	public static int SquareOfSum( int number )
	{
		int total = ( number * ( number + 1 ) ) / 2;
		return total *= total;
	}
	
	public static int SumOfSquares( int number )
	{
		int total = ( number * ( number + 1 ) * ( 2 * number + 1) ) / 6;
		return total;
		
	}
	
	public static void main( String[] args )
	{
		System.out.println( SquareOfSum( 100 ) - SumOfSquares( 100 ) );
	}
}
