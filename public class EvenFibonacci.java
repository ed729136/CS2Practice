public class EvenFibonacci
{
	public static int fib( int n )
	{
//		int result = 0;
		
		int[] memo = new int[ n + 1 ];
		memo[ 1 ] = memo[ 2 ] = 1;
		
		for( int i = 3; i < n + 1; ++i )
		{
			memo[ i ] = memo[ i - 1 ] + memo[ i - 2 ];
			
//			if( memo[ i ] % 2 == 0 )
//			{
//				result += memo[ i ];
//			}
		}
		return memo[ n ];
	}
	
	public static void main( String[] args )
	{
		System.out.println( fib( 33 ) );
	}

}
